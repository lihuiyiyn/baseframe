/**
 * 
 */
package cn.lswe.baseframe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.lswe.baseframe.bean.base.BaseRspBean;
import cn.lswe.baseframe.bean.base.BaseUser;
import cn.lswe.baseframe.bean.extra.SendSmsResultBean;
import cn.lswe.baseframe.bean.extra.SmsBean;
import cn.lswe.baseframe.bean.login.LoginPhoneReqBean;
import cn.lswe.baseframe.bean.login.LoginReqBean;
import cn.lswe.baseframe.bean.login.LoginSetCodeReqBean;
import cn.lswe.baseframe.bean.login.LoginSetEmailReqBean;
import cn.lswe.baseframe.bean.login.PhoneVerifyCodeReqBean;
import cn.lswe.baseframe.bean.login.VerifyCodeBean;
import cn.lswe.baseframe.dao.LoginDao;
import cn.lswe.baseframe.util.RandomUtil;
import cn.lswe.baseframe.util.RedisUtil;
import cn.lswe.baseframe.util.RegexUtil;
import cn.lswe.baseframe.util.SmsUtil;

/**
 * @author sam
 */
@Component
public class LoginService {

	@Autowired
	private LoginDao loginDao;

	/**
	 * 13200优医就诊登录
	 * 
	 * @param loginReqBean
	 * @return
	 */
	public BaseRspBean login(LoginReqBean loginReqBean) {
		BaseRspBean baseRspBean = new BaseRspBean();
		if (loginReqBean != null && loginReqBean.getAccount() != null && loginReqBean.getCode() != null) {
			BaseUser baseUser = loginDao.login(loginReqBean);
			if (baseUser == null) {
				baseRspBean.setError_code(-1);
				baseRspBean.setError_message("账号或者密码错误");
			} else {
				String token = RedisUtil.putUser(baseUser);
				baseRspBean.setToken(token);
			}
		} else {
			baseRspBean.setError_code(-1);
			baseRspBean.setError_message("账号或密码为空");
		}
		return baseRspBean;
	}

	/**
	 * 13202短信验证登录(获取短信验证码)
	 * 
	 * @param phoneVerifyCodeReqBean
	 * @return
	 */
	public BaseRspBean phoneVerifyCode(PhoneVerifyCodeReqBean phoneVerifyCodeReqBean) {
		BaseRspBean baseRspBean = new BaseRspBean();
		// 1.正则匹配手机号码 如果手机号码不符合要求，返回错误信息
		if (RegexUtil.matchPhone(phoneVerifyCodeReqBean.getPhone())) {
			// 2.判断该手机号码5分钟之内是否发过短信
			VerifyCodeBean verifyCodeBean = RedisUtil.getVerifyCode(phoneVerifyCodeReqBean.getPhone());
			if (verifyCodeBean != null) {
				baseRspBean.setError_code(5);
				baseRspBean.setError_message("此次忽略，验证码5分钟只能获取一次");
				return baseRspBean;
			}
			// 3.下发短信
			String verifyCode = RandomUtil.getSmsVerifyCode();
			SmsBean smsBean = new SmsBean();
			smsBean.setContent(verifyCode);
			smsBean.setPhone(phoneVerifyCodeReqBean.getPhone());
			SendSmsResultBean sendSmsResultBean = SmsUtil.send(smsBean);
			if (sendSmsResultBean != null && sendSmsResultBean.getRetCode() == 0) {
				// 3.1 短信下发成功 把验证码放缓存
				verifyCodeBean = new VerifyCodeBean();
				verifyCodeBean.setCode(verifyCode);
				verifyCodeBean.setTimeStamp(sendSmsResultBean.getTimeStamp());
				if ("OK".equals(RedisUtil.putVerifyCode(phoneVerifyCodeReqBean.getPhone(), verifyCodeBean))) {
					baseRspBean.setError_code(0);
					baseRspBean.setError_message("短信发送成功");
				} else {
					baseRspBean.setError_code(-1);
					baseRspBean.setError_message("发送验证码成功，但是放缓存失败");
				}
			} else {
				baseRspBean.setError_code(sendSmsResultBean.getRetCode());
				baseRspBean.setError_message("服务商发短信失败");
			}
		} else {
			// 手机号码格式不合法
			baseRspBean.setError_code(4);
			baseRspBean.setError_message("手机号码格式错误");
		}
		return baseRspBean;
	}

	/**
	 * 13202短信验证登录(验证短信验证码)
	 * 
	 * @param loginBySmsReqBean
	 * @return
	 */
	public BaseRspBean loginPhone(LoginPhoneReqBean loginPhoneReqBean) {
		BaseRspBean baseRspBean = new BaseRspBean();
		// 校验手机号码及验证码格式是否有效
		if (RegexUtil.matchPhone(loginPhoneReqBean.getPhone())
				&& RegexUtil.matchVerifyCode(loginPhoneReqBean.getCode())) {
			VerifyCodeBean verifyCodeBean = RedisUtil.getVerifyCode(loginPhoneReqBean.getPhone());
			if (verifyCodeBean == null) {
				baseRspBean.setError_code(3);
				baseRspBean.setError_message("验证码过期");
				return baseRspBean;
			} else {
				if (loginPhoneReqBean.getCode().equals(verifyCodeBean.getCode())) {
					// 短信验证成功
					RedisUtil.remove(loginPhoneReqBean.getPhone());
					// 去数据库中查询用户的基本信息
					BaseUser baseUser = loginDao.getBaseUserByPhone(loginPhoneReqBean.getPhone());
					// 说明用户是初次验证，数据库中没记录
					if (baseUser == null) {
						baseUser = new BaseUser();
						baseRspBean.setError_code(1);
						baseRspBean.setError_message("用户是初次登登录");
						baseUser.setPhone(loginPhoneReqBean.getPhone());
					} else {
						baseRspBean.setError_code(0);
						baseRspBean.setError_message("验证成功");
					}
					String token = RedisUtil.putUser(baseUser);
					baseRspBean.setToken(token);
				} else {
					// 短信验证失败
					int times = verifyCodeBean.getWrongTime();
					if (times == 4) {
						baseRspBean.setError_code(3);
						baseRspBean.setError_message("验证码失效");
						RedisUtil.remove(loginPhoneReqBean.getPhone());
					} else {
						verifyCodeBean.setWrongTime(++times);
						RedisUtil.putVerifyCode(loginPhoneReqBean.getPhone(), verifyCodeBean);
						baseRspBean.setError_code(3);
						baseRspBean.setError_message("验证码错误");
					}
				}
			}
		} else {
			baseRspBean.setError_code(-1);
			baseRspBean.setError_message("手机号码或者验证码格式有误");
		}
		return baseRspBean;
	}

	/**
	 * 13101设置登录密码
	 * 
	 * @param loginSetCodeReqBean
	 * @return
	 */
	public BaseRspBean loginSetCode(LoginSetCodeReqBean loginSetCodeReqBean) {
		BaseRspBean baseRspBean = new BaseRspBean();
		// 1.去数据库中验证此账号是否已经被占用
		// 2.插入数据到DB
		// 3.返回设置结果
		return baseRspBean;
	}

	/**
	 * 13102设置邮箱
	 * 
	 * @param loginSetEmailReqBean
	 * @return
	 */
	public BaseRspBean loginSetEmail(LoginSetEmailReqBean loginSetEmailReqBean) {
		BaseRspBean baseRspBean = new BaseRspBean();
		// 1.验证用户邮箱是否已经注册过
		// 2.更新DB
		// 3.返回设置结果
		return baseRspBean;
	}
}

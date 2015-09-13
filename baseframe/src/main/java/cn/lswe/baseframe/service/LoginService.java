/**
 * 
 */
package cn.lswe.baseframe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.lswe.baseframe.bean.LoginUserInfoData;
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
import cn.lswe.baseframe.dao.entity.UserEntity;
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
		String account = loginReqBean.getAccount();
		String code = loginReqBean.getCode();
		if (account == null || code == null) {
			baseRspBean.setError_code(-1);
			baseRspBean.setError_message("账号或密码为空");
			return baseRspBean;
		} else {
			int retCode = loginDao.login(loginReqBean);
			if (retCode == 0) {
				baseRspBean.setError_code(-1);
				baseRspBean.setError_message("账号或者密码错误");
				return baseRspBean;
			} else if (retCode > 0) {
				baseRspBean.setError_message("还未完成生成token的方法，此接口返回只用于测试使用");
				baseRspBean.setToken("1024");
				return baseRspBean;
			}
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
			VerifyCodeBean verifyCodeBean = RedisUtil.getVerifyCode(phoneVerifyCodeReqBean.getPhone());
			if (verifyCodeBean != null) {
				baseRspBean.setError_code(5);
				baseRspBean.setError_message("此次忽略，验证码5分钟只能获取一次");
				return baseRspBean;
			}
			// 2.下发短信
			String verifyCode = RandomUtil.getSmsVerifyCode();
			SmsBean smsBean = new SmsBean();
			smsBean.setContent(verifyCode);
			smsBean.setPhone(phoneVerifyCodeReqBean.getPhone());
			SendSmsResultBean sendSmsResultBean = SmsUtil.send(smsBean);
			if (sendSmsResultBean != null && sendSmsResultBean.getRetCode() == 0) {
				// 2.1 短信下发成功
				// 3.去数据库中查询是否有此用户
				UserEntity userEntity = loginDao.getSimpleUserByPhone(phoneVerifyCodeReqBean.getPhone());
				verifyCodeBean = new VerifyCodeBean();
				if (userEntity == null) {
					// 3.1 用户未注册
					baseRspBean.setError_code(3);
					baseRspBean.setError_message("手机号不存在");
					verifyCodeBean.setType(0);
				} else {
					// 3.2 用户已经注册过
					baseRspBean.setError_code(0);
					baseRspBean.setError_message("短信发送成功");
					verifyCodeBean.setType(1);
				}
				verifyCodeBean.setCode(verifyCode);
				verifyCodeBean.setTimeStamp(sendSmsResultBean.getTimeStamp());
				RedisUtil.putVerifyCode(phoneVerifyCodeReqBean.getPhone(), verifyCodeBean);
			} else {
				// 2.2 短信发送失败
				baseRspBean.setError_code(-1);
				baseRspBean.setError_message("短信发送失败");
			}
			return baseRspBean;
		} else {
			// 1.2 手机号码格式不合法
			baseRspBean.setError_code(4);
			baseRspBean.setError_message("手机号码格式错误");
			return baseRspBean;
		}
	}

	/**
	 * 13202短信验证登录(验证短信验证码)
	 * 
	 * @param loginBySmsReqBean
	 * @return
	 */
	public BaseRspBean loginPhone(LoginPhoneReqBean loginPhoneReqBean) {
		BaseRspBean baseRspBean = new BaseRspBean();
		String phone = loginPhoneReqBean.getPhone();
		String code = loginPhoneReqBean.getCode();
		if (RegexUtil.matchPhone(phone) && RegexUtil.matchVerifyCode(code)) {
			VerifyCodeBean verifyCodeBean = RedisUtil.getVerifyCode(phone);
			if (verifyCodeBean == null) {
				baseRspBean.setError_code(3);
				baseRspBean.setError_message("验证码过期");
				return baseRspBean;
			}
			int verifyType = verifyCodeBean.getType();
			if (code.equals(verifyCodeBean.getCode())) {
				// 短信验证成功
				RedisUtil.remove(phone);
				switch (verifyType) {
				case 0:
					baseRspBean.setError_code(-1);
					baseRspBean.setError_message("新用户");
					break;
				case 1:
					// 从数据库中查询要该用户信息
					LoginUserInfoData loginUserInfoData = new LoginUserInfoData();
					// 此处放置从DB中查询到的用户信息数据，然后整合到loginUserInfoData
					baseRspBean.setData(loginUserInfoData);
					BaseUser baseUser = new BaseUser();
					baseUser.setEmail(loginUserInfoData.getEmail());
					baseUser.setPhone(phone);
					String token = RedisUtil.putUser(baseUser);
					if (token == null) {
						// 登录验证成功 但是放缓存失败
					} else {
						baseRspBean.setToken(token);
					}
					break;
				case 2:
					// 设置新密码的方法
					break;
				}
				return baseRspBean;
			} else {
				// 验证码错误
				int times = verifyCodeBean.getWrongTime();
				if (times == 4) {
					baseRspBean.setError_code(3);
					baseRspBean.setError_message("验证码失效");
					RedisUtil.remove(phone);
				} else {
					verifyCodeBean.setWrongTime(++times);
					RedisUtil.putVerifyCode(phone, verifyCodeBean);
					baseRspBean.setError_code(3);
					baseRspBean.setError_message("验证码错误");
				}
				return baseRspBean;
			}
		} else {
			baseRspBean.setError_code(3);
			baseRspBean.setError_message("验证码错误");
			return baseRspBean;
		}
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

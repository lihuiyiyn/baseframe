/**
 * 
 */
package cn.lswe.baseframe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.lswe.baseframe.bean.LoginPhoneReqBean;
import cn.lswe.baseframe.bean.LoginReqBean;
import cn.lswe.baseframe.bean.LoginSetCodeReqBean;
import cn.lswe.baseframe.bean.LoginSetEmailReqBean;
import cn.lswe.baseframe.bean.LoginUserInfoData;
import cn.lswe.baseframe.bean.PhoneVerifyCodeReqBean;
import cn.lswe.baseframe.bean.UserReqBean;
import cn.lswe.baseframe.bean.base.BaseRspBean;
import cn.lswe.baseframe.dao.LoginDao;

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
			baseRspBean.setError_message("账号与密码不能同时为空");
			return baseRspBean;
		} else {
			// 去数据库中查询验证账号密码没错
			LoginUserInfoData loginUserInfoData = new LoginUserInfoData();
			// 此处放置从DB中查询到的用户信息数据，然后整合到loginUserInfoData
			baseRspBean.setData(loginUserInfoData);
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
		// 2.去数据库中查询是否有此用户
		// 3.此用户存在，下发短信验证码，并且需要把验证码放入缓存
		baseRspBean.setError_message("OK");
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
		String phone = loginPhoneReqBean.getPhone();
		String code = loginPhoneReqBean.getCode();
		if (phone == null || code == null) {
			baseRspBean.setError_code(3);
			baseRspBean.setError_message("验证码错误");
			return baseRspBean;
		} else {
			// 1.去缓存中验证code 是否正确
			// 2.正确时
			if (code.equals("new")) // 假方法
			{
				baseRspBean.setError_code(-1);
				baseRspBean.setError_message("新用户");
				return baseRspBean;
			} else {
				// 去数据库中查询验证账号密码没错
				LoginUserInfoData loginUserInfoData = new LoginUserInfoData();
				// 此处放置从DB中查询到的用户信息数据，然后整合到loginUserInfoData
				baseRspBean.setData(loginUserInfoData);
				return baseRspBean;
			}
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

	/**
	 * 账号(手机号码/邮箱)密码登录验证
	 * 
	 * @param userReqBean
	 * @return
	 */
	public BaseRspBean login(UserReqBean userReqBean) {
		BaseRspBean baseRspBean = new BaseRspBean();
		// 1.处理/检验UserReqBean的参数
		String phoneNumber = userReqBean.getPhoneNumber();
		String email = userReqBean.getEmail();
		if (phoneNumber == null && email == null) {
			baseRspBean.setError_code(-1);
			baseRspBean.setError_message("手机号码与Email地址不能同时为空");
			return baseRspBean;
		}
		String password = userReqBean.getPassword();
		if (password == null) {
			baseRspBean.setError_code(-1);
			baseRspBean.setError_message("密码不能为空");
			return baseRspBean;
		}
		// 2.与dao层交互
		int count = loginDao.varify(userReqBean);
		if (count == 0) {
			// 说明密码表中有账号和密码都符合的
			baseRspBean.setError_code(-1);
			baseRspBean.setError_message("账号或者密码有误");
			// 可以利用缓存添加连续几次登录失败禁止登录方法
			return baseRspBean;
		} else {
			// 登录成功
			// （1）生成Token
			// （2）放入缓存或者数据库中
			// （3）返回登陆结果或者初次登录需要响应的数据
		}
		// 3.拼装RspBean
		return baseRspBean;
	}
}

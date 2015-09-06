/**
 * 
 */
package cn.lswe.baseframe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.lswe.baseframe.bean.LoginUserInfoData;
import cn.lswe.baseframe.bean.base.BaseRspBean;
import cn.lswe.baseframe.bean.login.LoginPhoneReqBean;
import cn.lswe.baseframe.bean.login.LoginReqBean;
import cn.lswe.baseframe.bean.login.LoginSetCodeReqBean;
import cn.lswe.baseframe.bean.login.LoginSetEmailReqBean;
import cn.lswe.baseframe.bean.login.PhoneVerifyCodeReqBean;
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
			baseRspBean.setError_message("账号或密码为空");
			return baseRspBean;
		} else {
			int retCode = loginDao.login(loginReqBean);
			System.out.println(retCode);
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
}

/**
 * 
 */
package cn.lswe.baseframe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.lswe.baseframe.bean.UserReqBean;
import cn.lswe.baseframe.bean.base.BaseRspBean;
import cn.lswe.baseframe.dao.UserDao;

/**
 * @author sam
 */
@Component
public class UserService {

	@Autowired
	private UserDao userDao;

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
		// 2.与Dao层交互
		int count = userDao.select(userReqBean);
		if (count == 0) {
			// 说明密码表中有账号和密码都符合的
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

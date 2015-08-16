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

		// 2.与Dao层交互

		// 3.拼装RspBean

		return baseRspBean;
	}
}

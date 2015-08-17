/**
 * 
 */
package cn.lswe.baseframe.service;

import org.springframework.stereotype.Component;

import cn.lswe.baseframe.bean.LoginReqBean;
import cn.lswe.baseframe.bean.base.BaseRspBean;

/**
 * @author sam
 */
@Component
public class LoginService {

	/**
	 * 登录
	 * 
	 * @param loginReqBean
	 * @return
	 */
	public BaseRspBean login(LoginReqBean loginReqBean) {
		BaseRspBean BaseRspBean = new BaseRspBean();
		return BaseRspBean;
	}
}

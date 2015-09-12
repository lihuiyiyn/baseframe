/**
 * 
 */
package cn.lswe.baseframe.util;

import javax.servlet.http.HttpServletRequest;

import cn.lswe.baseframe.bean.base.BaseUser;
import cn.lswe.baseframe.global.Constant;

/**
 * @author sam
 */
public class UserUtil {

	/**
	 * 从HttpServletRequest request取user
	 * 
	 * @param request
	 * @return
	 */
	public static BaseUser getUser(HttpServletRequest request) {
		return (BaseUser) request.getAttribute(Constant.user.LoginUser);
	}
}

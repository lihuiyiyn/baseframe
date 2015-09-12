/**
 * 
 */
package cn.lswe.baseframe.util;

import javax.servlet.http.HttpServletRequest;

import cn.lswe.baseframe.bean.base.BaseUser;

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
		return (BaseUser) request.getAttribute("user");
	}
}

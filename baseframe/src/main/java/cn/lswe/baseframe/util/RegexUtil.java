/**
 * 
 */
package cn.lswe.baseframe.util;

import cn.lswe.baseframe.global.Constant;

/**
 * @author LauShallwe
 */
public class RegexUtil {

	/**
	 * 匹配字符串是否是邮箱
	 * 
	 * @param email
	 * @return
	 */
	public static boolean matchEmail(String email) {
		return matchRx(email, Constant.regex.emailRx);
	}

	/**
	 * 匹配字符串是否是手机号码
	 * 
	 * @param phone
	 * @return
	 */
	public static boolean matchPhone(String phone) {
		return matchRx(phone, Constant.regex.phoneRx);
	}

	/**
	 * 匹配
	 * 
	 * @param string
	 * @param regex
	 * @return
	 */
	public static boolean matchRx(String string, String regex) {
		if (string != null && regex != null)
			return string.matches(regex);
		return false;
	}
}
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
	 * 匹配是否密码格式
	 * 
	 * @param password
	 * @return
	 */
	public static boolean matchPsw(String password) {
		return matchRx(password, Constant.regex.pswRx);
	}

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
	 * 匹配6位数字字符串
	 * 
	 * @param verifyCode
	 * @return
	 */
	public static boolean matchVerifyCode(String verifyCode) {
		return matchRx(verifyCode, Constant.regex.verifyCodeRx);
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

/**
 * 
 */
package cn.lswe.baseframe.util;

import java.util.Random;

/**
 * @author LauShallwe
 */
public class RandomUtil {

	private static int tokenLength = 20;

	private static int smsVerifyCodeLength = 6;

	private static String allNumbers = "0123456789";

	private static String allLetters = "abcdefghijklmnopqrstuvwxyz0123456789";

	/**
	 * 生成TOKEN
	 * 
	 * @return
	 */
	public static String getToken() {
		return getRandomString(tokenLength);
	}

	/**
	 * 生成短信验证码
	 * 
	 * @return
	 */
	public static String getSmsVerifyCode() {
		return getRandomNumberString(smsVerifyCodeLength);
	}

	/**
	 * 生成指定位数的随机字符串
	 * 
	 * @param length
	 * @return
	 */
	public static String getRandomString(int length) {
		// length表示生成字符串的长度
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			int number = random.nextInt(allLetters.length());
			sb.append(allLetters.charAt(number));
		}
		return sb.toString();
	}

	/**
	 * 生成数字字符串
	 * 
	 * @param length
	 * @return
	 */
	public static String getRandomNumberString(int length) {
		// length表示生成字符串的长度
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			int number = random.nextInt(allNumbers.length());
			sb.append(allNumbers.charAt(number));
		}
		return sb.toString();
	}
}

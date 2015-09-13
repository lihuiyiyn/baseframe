/**
 * 
 */
package cn.lswe.baseframe.bean.login;

/**
 * @author LauShallwe
 */
public class VerifyCodeBean {

	/**
	 * 0.快速注册; 1.登录验证；2.修改密码
	 */
	private int type;

	/**
	 * 6位短信验证码
	 */
	private String code;

	/**
	 * 错误次数，验证短信最多5次
	 */
	private int wrongTime = 0;

	/**
	 * 时间戳
	 */
	private String timeStamp;

	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the wrongTime
	 */
	public int getWrongTime() {
		return wrongTime;
	}

	/**
	 * @param wrongTime
	 *            the wrongTime to set
	 */
	public void setWrongTime(int wrongTime) {
		this.wrongTime = wrongTime;
	}

	/**
	 * @return the timeStamp
	 */
	public String getTimeStamp() {
		return timeStamp;
	}

	/**
	 * @param timeStamp
	 *            the timeStamp to set
	 */
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	@Override
	public String toString() {
		return "VerifyCodeBean [type=" + type + ", code=" + code + ", wrongTime=" + wrongTime + ", timeStamp="
				+ timeStamp + "]";
	}
}

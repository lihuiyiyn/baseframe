/**
 * 
 */
package cn.lswe.baseframe.bean.base;

/**
 * @author sam
 */
public class BaseUser {

	/**
	 * 手机号码
	 */
	private String phone;

	/**
	 * email
	 */
	private String email;

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone
	 *            the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "BaseUser [phone=" + phone + ", email=" + email + "]";
	}
}

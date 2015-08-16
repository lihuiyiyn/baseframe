/**
 * 
 */
package cn.lswe.baseframe.bean;

import cn.lswe.baseframe.bean.base.BaseReqBean;

/**
 * @author sam
 */
public class UserReqBean extends BaseReqBean {

	/**
	 * 手机号【手机和邮箱必填其中之一】
	 */
	private String phoneNumber;

	/**
	 * 邮箱
	 */
	private String email;

	/**
	 * 密码【必填】
	 */
	private String password;

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber
	 *            the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserReqBean [phoneNumber=" + phoneNumber + ", email=" + email + ", password=" + password
				+ ", getFrom()=" + getFrom() + ", getVersion()=" + getVersion() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}

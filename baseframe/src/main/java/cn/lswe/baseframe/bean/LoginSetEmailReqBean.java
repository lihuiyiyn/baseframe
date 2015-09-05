/**
 * 
 */
package cn.lswe.baseframe.bean;

import cn.lswe.baseframe.bean.base.BaseReqBean;

/**
 * @author LauShallwe
 */
public class LoginSetEmailReqBean extends BaseReqBean {

	/**
	 * 手机号码
	 */
	private String phone;

	/**
	 * 邮件地址
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
		return "LoginSetEmailReqBean [phone=" + phone + ", email=" + email + ", toString()=" + super.toString() + "]";
	}
}

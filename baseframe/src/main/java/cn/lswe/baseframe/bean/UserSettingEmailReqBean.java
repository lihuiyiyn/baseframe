/**
 * 
 */
package cn.lswe.baseframe.bean;

import cn.lswe.baseframe.bean.base.BaseReqBean;

/**
 * @author LauShallwe
 */
public class UserSettingEmailReqBean extends BaseReqBean {

	/**
	 * 邮件地址
	 */
	private String email;

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
		return "UserSettingEmailReqBean [email=" + email + ", toString()=" + super.toString() + "]";
	}
}

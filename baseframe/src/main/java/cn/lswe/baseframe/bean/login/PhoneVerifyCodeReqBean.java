/**
 * 
 */
package cn.lswe.baseframe.bean.login;

import cn.lswe.baseframe.bean.base.BaseReqBean;

/**
 * @author LauShallwe
 */
public class PhoneVerifyCodeReqBean extends BaseReqBean {

	/**
	 * 手机号码
	 */
	private String phone;

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

	@Override
	public String toString() {
		return "PhoneVerifyCodeReqBean [phone=" + phone + ", toString()=" + super.toString() + "]";
	}
}

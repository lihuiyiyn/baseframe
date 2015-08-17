/**
* 
*/
package cn.lswe.baseframe.bean;

import cn.lswe.baseframe.bean.base.BaseReqBean;

/**
 * @author LauShallwe
 */
public class LoginByVerifyCodeReqBean extends BaseReqBean {

	/**
	 * 手机号【必填】
	 */
	private String phoneNUmber;

	/**
	 * 验证码【必填】
	 */
	private String verifyCode;

	/**
	 * @return the phoneNUmber
	 */
	public String getPhoneNUmber() {
		return phoneNUmber;
	}

	/**
	 * @param phoneNUmber
	 *            the phoneNUmber to set
	 */
	public void setPhoneNUmber(String phoneNUmber) {
		this.phoneNUmber = phoneNUmber;
	}

	/**
	 * @return the verifyCode
	 */
	public String getVerifyCode() {
		return verifyCode;
	}

	/**
	 * @param verifyCode
	 *            the verifyCode to set
	 */
	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}

	@Override
	public String toString() {
		return "LoginBySmsReqBean [phoneNUmber=" + phoneNUmber + ", verifyCode=" + verifyCode + ", toString()="
				+ super.toString() + "]";
	}
}

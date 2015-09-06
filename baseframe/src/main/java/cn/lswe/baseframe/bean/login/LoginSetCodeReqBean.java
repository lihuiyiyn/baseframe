/**
 * 
 */
package cn.lswe.baseframe.bean.login;

import cn.lswe.baseframe.bean.base.BaseReqBean;

/**
 * @author LauShallwe
 */
public class LoginSetCodeReqBean extends BaseReqBean {

	/**
	 * 账户名称
	 */
	private String account;

	/**
	 * 密码（MD5后）
	 */
	private String code;

	/**
	 * @return the account
	 */
	public String getAccount() {
		return account;
	}

	/**
	 * @param account
	 *            the account to set
	 */
	public void setAccount(String account) {
		this.account = account;
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

	@Override
	public String toString() {
		return "LoginSetCodeReqBean [account=" + account + ", code=" + code + ", toString()=" + super.toString() + "]";
	}
}

package cn.lswe.baseframe.bean;

import cn.lswe.baseframe.bean.base.BaseReqBean;

/**
 * 13200优医就诊登录
 * 
 * @author sam
 */
public class LoginReqBean extends BaseReqBean {

	/**
	 * 账户：email/phone/user_id
	 */
	private String account;

	/**
	 * 密码
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
		return "LoginReqBean [account=" + account + ", code=" + code + ", toString()=" + super.toString() + "]";
	}
}

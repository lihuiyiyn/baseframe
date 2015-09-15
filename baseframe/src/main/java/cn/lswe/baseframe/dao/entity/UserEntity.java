package cn.lswe.baseframe.dao.entity;

/**
 * @author sam
 */
public class UserEntity extends BaseEntity {

	/**
	 * 账户
	 */
	private String account;

	/**
	 * 电话号码
	 */
	private String phone;

	/**
	 * 密码
	 */
	private String code;

	/**
	 * Email
	 */
	private String mail;

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
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * @param mail
	 *            the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "UserEntity [account=" + account + ", phone=" + phone + ", code=" + code + ", mail=" + mail + "]";
	}
}

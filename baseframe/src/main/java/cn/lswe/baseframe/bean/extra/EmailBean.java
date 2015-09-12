/**
 * 
 */
package cn.lswe.baseframe.bean.extra;

/**
 * @author LauShallwe
 */
public class EmailBean {

	/**
	 * 发邮件的账户
	 */
	private String from_account;

	/**
	 * 发邮件的账户密码
	 */
	private String pass_word;

	/**
	 * 收邮件的账户
	 */
	private String to_account;

	/**
	 * 邮件的主题
	 */
	private String email_subject;

	/**
	 * 邮件的内容
	 */
	private String email_content;

	/**
	 * HOST地址
	 */
	private String hostname;

	/**
	 * @return the from_account
	 */
	public String getFrom_account() {
		return from_account;
	}

	/**
	 * @param from_account
	 *            the from_account to set
	 */
	public void setFrom_account(String from_account) {
		this.from_account = from_account;
	}

	/**
	 * @return the pass_word
	 */
	public String getPass_word() {
		return pass_word;
	}

	/**
	 * @param pass_word
	 *            the pass_word to set
	 */
	public void setPass_word(String pass_word) {
		this.pass_word = pass_word;
	}

	/**
	 * @return the to_account
	 */
	public String getTo_account() {
		return to_account;
	}

	/**
	 * @param to_account
	 *            the to_account to set
	 */
	public void setTo_account(String to_account) {
		this.to_account = to_account;
	}

	/**
	 * @return the email_subject
	 */
	public String getEmail_subject() {
		return email_subject;
	}

	/**
	 * @param email_subject
	 *            the email_subject to set
	 */
	public void setEmail_subject(String email_subject) {
		this.email_subject = email_subject;
	}

	/**
	 * @return the email_content
	 */
	public String getEmail_content() {
		return email_content;
	}

	/**
	 * @param email_content
	 *            the email_content to set
	 */
	public void setEmail_content(String email_content) {
		this.email_content = email_content;
	}

	/**
	 * @return the hostname
	 */
	public String getHostname() {
		return hostname;
	}

	/**
	 * @param hostname
	 *            the hostname to set
	 */
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	@Override
	public String toString() {
		return "EmailBean [from_account=" + from_account + ", pass_word=" + pass_word + ", to_account=" + to_account
				+ ", email_subject=" + email_subject + ", email_content=" + email_content + ", hostname=" + hostname
				+ "]";
	}
}

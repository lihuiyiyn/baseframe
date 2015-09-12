/**
 * 
 */
package cn.lswe.baseframe.bean.extra;

/**
 * @author LauShallwe
 */
public class SmsBean {

	/**
	 * 接收短信手机号码
	 */
	private String phone;

	/**
	 * 短信内容
	 */
	private String content;

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
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content
	 *            the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "SmsBean [phone=" + phone + ", content=" + content + "]";
	}
}

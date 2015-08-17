/**
 * 
 */
package cn.lswe.baseframe.bean;

/**
 * @author sam
 */
public class ExpressAddressBean {

	/**
	 * 用户标识ID
	 */
	private int data_id;

	/**
	 * 收件名
	 */
	private String name;

	/**
	 * 手机号码
	 */
	private String phone;

	/**
	 * 具体地址
	 */
	private String addrsss;

	/**
	 * @return the data_id
	 */
	public int getData_id() {
		return data_id;
	}

	/**
	 * @param data_id
	 *            the data_id to set
	 */
	public void setData_id(int data_id) {
		this.data_id = data_id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	 * @return the addrsss
	 */
	public String getAddrsss() {
		return addrsss;
	}

	/**
	 * @param addrsss
	 *            the addrsss to set
	 */
	public void setAddrsss(String addrsss) {
		this.addrsss = addrsss;
	}

	@Override
	public String toString() {
		return "ExpressAddressBean [data_id=" + data_id + ", name=" + name + ", phone=" + phone + ", addrsss=" + addrsss
				+ ", toString()=" + super.toString() + "]";
	}
}

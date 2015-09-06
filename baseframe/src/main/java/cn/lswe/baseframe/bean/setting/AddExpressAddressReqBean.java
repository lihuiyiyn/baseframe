/**
 * 
 */
package cn.lswe.baseframe.bean.setting;

import cn.lswe.baseframe.bean.base.BaseReqBean;

/**
 * @author LauShallwe
 */
public class AddExpressAddressReqBean extends BaseReqBean {

	/**
	 * data_id
	 */
	private String data_id;

	/**
	 * 收件人名字
	 */
	private String name;

	/**
	 * 收件人手机号码
	 */
	private String phone;

	/**
	 * 收件人地址
	 */
	private String address;

	/**
	 * @return the data_id
	 */
	public String getData_id() {
		return data_id;
	}

	/**
	 * @param data_id
	 *            the data_id to set
	 */
	public void setData_id(String data_id) {
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
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "AddExpressAddressReqBean [data_id=" + data_id + ", name=" + name + ", phone=" + phone + ", address="
				+ address + ", toString()=" + super.toString() + "]";
	}
}

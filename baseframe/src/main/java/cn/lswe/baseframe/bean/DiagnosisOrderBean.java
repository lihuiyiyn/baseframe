/**
 * 
 */
package cn.lswe.baseframe.bean;

import java.util.Date;

/**
 * @author sam
 */
public class DiagnosisOrderBean {

	/**
	 * 订单标识ID
	 */
	private int data_id;

	/**
	 * 订单类型
	 */
	private String order;

	/**
	 * 约定时间
	 * 
	 * @eg 2015-08-08 14:00-15:00
	 */
	private Date datetime;

	/**
	 * 地址
	 */
	private String address;

	/**
	 * 状态
	 */
	private String state;

	public int getData_id() {
		return data_id;
	}

	public void setData_id(int data_id) {
		this.data_id = data_id;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "DiagnosisOrderBean [data_id=" + data_id + ", order=" + order + ", datetime=" + datetime + ", address="
				+ address + ", state=" + state + "]";
	}
}
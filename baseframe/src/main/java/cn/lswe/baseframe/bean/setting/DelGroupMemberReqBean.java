/**
 * 
 */
package cn.lswe.baseframe.bean.setting;

import cn.lswe.baseframe.bean.base.BaseReqBean;

/**
 * @author LauShallwe
 */
public class DelGroupMemberReqBean extends BaseReqBean {

	/**
	 * data_id:1
	 */
	private int data_id;

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

	@Override
	public String toString() {
		return "DelGroupMemberReqBean [data_id=" + data_id + ", toString()=" + super.toString() + "]";
	}
}

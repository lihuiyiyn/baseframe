/**
 * 
 */
package cn.lswe.baseframe.bean.setting;

import cn.lswe.baseframe.bean.base.BaseReqBean;

/**
 * @author LauShallwe
 */
public class DelExpressAddressReqBean extends BaseReqBean {

	/**
	 * data_id
	 */
	private String data_id;

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

	@Override
	public String toString() {
		return "DelExpressAddressReqBean [data_id=" + data_id + ", toString()=" + super.toString() + "]";
	}
}

/**
 * 
 */
package cn.lswe.baseframe.bean.mydiagnosis;

import cn.lswe.baseframe.bean.base.BaseReqBean;

/**
 * @author LauShallwe
 */
public class OrderDiagnosisReqBean extends BaseReqBean {

	/**
	 * 约诊ID
	 */
	private int order_diagnosis_id;

	/**
	 * @return the order_diagnosis_id
	 */
	public int getOrder_diagnosis_id() {
		return order_diagnosis_id;
	}

	/**
	 * @param order_diagnosis_id
	 *            the order_diagnosis_id to set
	 */
	public void setOrder_diagnosis_id(int order_diagnosis_id) {
		this.order_diagnosis_id = order_diagnosis_id;
	}

	@Override
	public String toString() {
		return "OrderDiagnosisReqBean [order_diagnosis_id=" + order_diagnosis_id + ", toString()=" + super.toString()
				+ "]";
	}
}

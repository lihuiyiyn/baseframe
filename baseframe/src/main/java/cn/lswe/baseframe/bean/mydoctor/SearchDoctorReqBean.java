/**
 * 
 */
package cn.lswe.baseframe.bean.mydoctor;

import cn.lswe.baseframe.bean.base.BaseReqBean;

/**
 * @author LauShallwe
 */
public class SearchDoctorReqBean extends BaseReqBean {

	/**
	 * 医生姓名
	 */
	private String name;

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

	@Override
	public String toString() {
		return "SearchDoctorReqBean [name=" + name + ", toString()=" + super.toString() + "]";
	}
}

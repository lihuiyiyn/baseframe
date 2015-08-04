/**
 * 
 */
package cn.lswe.baseframe.bean;

import cn.lswe.baseframe.bean.base.BaseReq;

/**
 * @author sam
 *
 */
public class TestReqBean extends BaseReq {

	private String name;

	private int age;

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
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
}

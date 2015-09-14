/**
 * 
 */
package cn.lswe.baseframe.bean.user;

import cn.lswe.baseframe.bean.base.BaseReqBean;

/**
 * @author LauShallwe
 */
public class UpdateUserSettingReqBean extends BaseReqBean {

	/**
	 * 用户姓名
	 */
	private String name;

	/**
	 * 用户年龄
	 */
	private int age;

	/**
	 * 性别
	 */
	private int sex;

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

	/**
	 * @return the sex
	 */
	public int getSex() {
		return sex;
	}

	/**
	 * @param sex
	 *            the sex to set
	 */
	public void setSex(int sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "UpdateUserSettingReqBean [name=" + name + ", age=" + age + ", sex=" + sex + ", toString()="
				+ super.toString() + "]";
	}
}

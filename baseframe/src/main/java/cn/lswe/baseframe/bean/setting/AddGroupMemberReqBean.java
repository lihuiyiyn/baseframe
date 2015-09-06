/**
 * 
 */
package cn.lswe.baseframe.bean.setting;

import cn.lswe.baseframe.bean.base.BaseReqBean;

/**
 * @author LauShallwe
 */
public class AddGroupMemberReqBean extends BaseReqBean {

	/**
	 * 用户ID
	 */
	private String user_id;

	/**
	 * 名字
	 */
	private String name;

	/**
	 * 手机号码
	 */
	private String phone;

	/**
	 * 性别
	 */
	private String sex;

	/**
	 * 年龄
	 */
	private String age;

	/**
	 * 关系
	 */
	private String relation;

	/**
	 * @return the user_id
	 */
	public String getUser_id() {
		return user_id;
	}

	/**
	 * @param user_id
	 *            the user_id to set
	 */
	public void setUser_id(String user_id) {
		this.user_id = user_id;
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
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @param sex
	 *            the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}

	/**
	 * @return the relation
	 */
	public String getRelation() {
		return relation;
	}

	/**
	 * @param relation
	 *            the relation to set
	 */
	public void setRelation(String relation) {
		this.relation = relation;
	}

	@Override
	public String toString() {
		return "AddGroupMemberReqBean [user_id=" + user_id + ", name=" + name + ", phone=" + phone + ", sex=" + sex
				+ ", age=" + age + ", relation=" + relation + ", toString()=" + super.toString() + "]";
	}
}

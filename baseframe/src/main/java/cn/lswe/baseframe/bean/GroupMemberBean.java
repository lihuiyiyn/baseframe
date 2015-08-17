/**
 * 
 */
package cn.lswe.baseframe.bean;

/**
 * @author sam
 */
public class GroupMemberBean {

	/**
	 * 用户标识ID
	 */
	private int data_id;

	/**
	 * 用户名称
	 */
	private String name;

	/**
	 * 性别
	 */
	private String sex;

	/**
	 * 年龄
	 */
	private int age;

	/**
	 * 手机号码
	 */
	private String phone;

	/**
	 * 头像地址
	 */
	private String icon;

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
	 * @return the icon
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * @param icon
	 *            the icon to set
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}

	@Override
	public String toString() {
		return "GroupMemberBean [data_id=" + data_id + ", name=" + name + ", sex=" + sex + ", age=" + age + ", phone="
				+ phone + ", icon=" + icon + "]";
	}
}

/**
 * 
 */
package cn.lswe.baseframe.bean;

import java.util.List;

/**
 * @author sam
 */
public class UserInfoBean {

	/**
	 * 用户ID
	 */
	private int user_id;

	/**
	 * 真实姓名
	 */
	private String real_name;

	/**
	 * 昵称
	 */
	private String nick_name;

	/**
	 * 手机号
	 */
	private String phone_number;

	/**
	 * 邮箱
	 */
	private String email;

	/**
	 * 等级
	 */
	private int level;

	/**
	 * 积分
	 */
	private int points;

	/**
	 * 性别 1 : 男 2 : 女
	 */
	private int gender;

	/**
	 * 年龄
	 */
	private int age;

	/**
	 * 家庭成员信息数组
	 */
	private List<UserInfoBean> family_members;

	/**
	 * 地址信息数组
	 */
	private List<AddressBean> address;

	/**
	 * @return the user_id
	 */
	public int getUser_id() {
		return user_id;
	}

	/**
	 * @param user_id
	 *            the user_id to set
	 */
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	/**
	 * @return the real_name
	 */
	public String getReal_name() {
		return real_name;
	}

	/**
	 * @param real_name
	 *            the real_name to set
	 */
	public void setReal_name(String real_name) {
		this.real_name = real_name;
	}

	/**
	 * @return the nick_name
	 */
	public String getNick_name() {
		return nick_name;
	}

	/**
	 * @param nick_name
	 *            the nick_name to set
	 */
	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}

	/**
	 * @return the phone_number
	 */
	public String getPhone_number() {
		return phone_number;
	}

	/**
	 * @param phone_number
	 *            the phone_number to set
	 */
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * @param level
	 *            the level to set
	 */
	public void setLevel(int level) {
		this.level = level;
	}

	/**
	 * @return the points
	 */
	public int getPoints() {
		return points;
	}

	/**
	 * @param points
	 *            the points to set
	 */
	public void setPoints(int points) {
		this.points = points;
	}

	/**
	 * @return the gender
	 */
	public int getGender() {
		return gender;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(int gender) {
		this.gender = gender;
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
	 * @return the family_members
	 */
	public List<UserInfoBean> getFamily_members() {
		return family_members;
	}

	/**
	 * @param family_members
	 *            the family_members to set
	 */
	public void setFamily_members(List<UserInfoBean> family_members) {
		this.family_members = family_members;
	}

	/**
	 * @return the address
	 */
	public List<AddressBean> getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(List<AddressBean> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "UserInfoBean [user_id=" + user_id + ", real_name=" + real_name + ", nick_name=" + nick_name
				+ ", phone_number=" + phone_number + ", email=" + email + ", level=" + level + ", points=" + points
				+ ", gender=" + gender + ", age=" + age + ", family_members=" + family_members + ", address=" + address
				+ "]";
	}
}

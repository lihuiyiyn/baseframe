/**
 * 
 */
package cn.lswe.baseframe.bean;

import java.util.ArrayList;
import java.util.List;

import cn.lswe.baseframe.bean.base.BaseData;

/**
 * @author sam
 */
public class LoginUserInfoData extends BaseData {

	/**
	 * 用户在数据库表中的ID
	 */
	private int data_id;

	/**
	 * 昵称
	 */
	private String nick_name;

	/**
	 * 性别 1/0
	 */
	private int grade;

	/**
	 * Email
	 */
	private String email;

	/**
	 * 用户头像地址
	 */
	private String icon;

	/**
	 * 收件地址
	 */
	private List<ExpressAddressBean> list_express_address;

	/**
	 * 家庭成员列表
	 */
	private List<GroupMemberBean> list_group_member;

	/**
	 * 订单列表
	 */
	private List<DiagnosisOrderBean> list_diagnosis_order;

	/**
	 * 喜欢的医生列表
	 */
	private List<FavoriteDoctorBean> list_favorite_doctor;

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
	 * @return the grade
	 */
	public int getGrade() {
		return grade;
	}

	/**
	 * @param grade
	 *            the grade to set
	 */
	public void setGrade(int grade) {
		this.grade = grade;
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

	/**
	 * @return the list_express_address
	 */
	public List<ExpressAddressBean> getList_express_address() {
		if (list_express_address == null)
			return new ArrayList<ExpressAddressBean>();
		else
			return list_express_address;
	}

	/**
	 * @return the list_group_member
	 */
	public List<GroupMemberBean> getList_group_member() {
		if (list_group_member == null)
			return new ArrayList<GroupMemberBean>();
		else
			return list_group_member;
	}

	/**
	 * @return the list_diagnosis_order
	 */
	public List<DiagnosisOrderBean> getList_diagnosis_order() {
		return list_diagnosis_order;
	}

	/**
	 * @return the list_favorite_doctor
	 */
	public List<FavoriteDoctorBean> getList_favorite_doctor() {
		return list_favorite_doctor;
	}

	@Override
	public String toString() {
		return "LoginUserInfoData [data_id=" + data_id + ", nick_name=" + nick_name + ", grade=" + grade + ", email="
				+ email + ", icon=" + icon + ", list_express_address=" + list_express_address + ", list_group_member="
				+ list_group_member + ", list_diagnosis_order=" + list_diagnosis_order + ", list_favorite_doctor="
				+ list_favorite_doctor + ", toString()=" + super.toString() + "]";
	}
}

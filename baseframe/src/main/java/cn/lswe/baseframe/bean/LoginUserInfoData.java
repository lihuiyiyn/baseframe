/**
 * 
 */
package cn.lswe.baseframe.bean;

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

}

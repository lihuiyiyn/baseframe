/**
 * 
 */
package cn.lswe.baseframe.bean;

import cn.lswe.baseframe.bean.base.BaseReqBean;

/**
 * @author LauShallwe
 */
public class UserSettingNickNameReqBean extends BaseReqBean {

	/**
	 * 昵称
	 */
	private String nick_name;

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

	@Override
	public String toString() {
		return "UserSettingNickNameReqBean [nick_name=" + nick_name + ", toString()=" + super.toString() + "]";
	}
}

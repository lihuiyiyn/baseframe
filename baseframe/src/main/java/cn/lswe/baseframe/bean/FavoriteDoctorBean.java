/**
 * 
 */
package cn.lswe.baseframe.bean;

/**
 * @author LauShallwe
 */
public class FavoriteDoctorBean {

	/**
	 * 医生ID
	 */
	private int data_id;

	/**
	 * 姓名
	 */
	private String name;

	/**
	 * 医生头像
	 */
	private String icon;

	/**
	 * 医生的当前状态
	 */
	private String state;

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
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "FavoriteDoctor [data_id=" + data_id + ", name=" + name + ", icon=" + icon + ", state=" + state + "]";
	}
}

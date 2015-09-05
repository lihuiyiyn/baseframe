/**
 * 
 */
package cn.lswe.baseframe.bean;

import cn.lswe.baseframe.bean.base.BaseReqBean;

/**
 * @author LauShallwe
 */
public class LoginPhoneReqBean extends BaseReqBean {

	/**
	 * 手机号码
	 */
	private String phone;

	/**
	 * 短信接收的验证码
	 */
	private String code;

	/**
	 * 设备信息
	 */
	private String device_info;

	/**
	 * 经度
	 */
	private double longitude;

	/**
	 * 纬度
	 */
	private double latitude;

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
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the device_info
	 */
	public String getDevice_info() {
		return device_info;
	}

	/**
	 * @param device_info
	 *            the device_info to set
	 */
	public void setDevice_info(String device_info) {
		this.device_info = device_info;
	}

	/**
	 * @return the longitude
	 */
	public double getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude
	 *            the longitude to set
	 */
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	/**
	 * @return the latitude
	 */
	public double getLatitude() {
		return latitude;
	}

	/**
	 * @param latitude
	 *            the latitude to set
	 */
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	@Override
	public String toString() {
		return "LoginPhoneReqBean [phone=" + phone + ", code=" + code + ", device_info=" + device_info + ", longitude="
				+ longitude + ", latitude=" + latitude + ", toString()=" + super.toString() + "]";
	}
}

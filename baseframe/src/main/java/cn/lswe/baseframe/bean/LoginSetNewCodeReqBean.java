/**
 * 
 */
package cn.lswe.baseframe.bean;

import cn.lswe.baseframe.bean.base.BaseReqBean;

/**
 * @author LauShallwe
 */
public class LoginSetNewCodeReqBean extends BaseReqBean {

	/**
	 * MD5加密后的密码
	 */
	private String code;

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

	@Override
	public String toString() {
		return "LoginSetNewCodeReqBean [code=" + code + ", toString()=" + super.toString() + "]";
	}
}

package cn.lswe.baseframe.bean.base;

/**
 * Request Base Bean
 * 
 * @author sam
 */
public class BaseReqBean {

	/**
	 * 客户端类型 如：ios或者android
	 */
	private String from;

	/**
	 * 客户端版本号 如：'1.0.0'
	 */
	private String version;

	/**
	 * TOKEN
	 */
	private String token;

	/**
	 * @return the from
	 */
	public String getFrom() {
		return from;
	}

	/**
	 * @param from
	 *            the from to set
	 */
	public void setFrom(String from) {
		this.from = from;
	}

	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * @param version
	 *            the version to set
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @param token
	 *            the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "BaseReqBean [from=" + from + ", version=" + version + ", token=" + token + "]";
	}
}

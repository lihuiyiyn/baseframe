package cn.lswe.baseframe.bean.base;

public class BaseRspBean {

	/**
	 * session_id
	 */
	private String token;

	/**
	 * 服务器状态码，0 为正常状态，异常状态待定。
	 */
	private int error_code = 0;

	/**
	 * 错误信息，仅 error_code 不为 0 时返回
	 */
	private String error_message;

	/**
	 * 数据字段
	 */
	private BaseData data;

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

	/**
	 * @return the error_code
	 */
	public int getError_code() {
		return error_code;
	}

	/**
	 * @param error_code
	 *            the error_code to set
	 */
	public void setError_code(int error_code) {
		this.error_code = error_code;
	}

	/**
	 * @return the error_message
	 */
	public String getError_message() {
		return error_message;
	}

	/**
	 * @param error_message
	 *            the error_message to set
	 */
	public void setError_message(String error_message) {
		this.error_message = error_message;
	}

	/**
	 * @return the data
	 */
	public BaseData getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(BaseData data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "BaseRspBean [token=" + token + ", error_code=" + error_code + ", error_message=" + error_message
				+ ", data=" + data + ", toString()=" + super.toString() + "]";
	}
}

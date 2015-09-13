/**
 * 
 */
package cn.lswe.baseframe.bean.extra;

/**
 * @author LauShallwe
 */
public class SendSmsResultBean {

	/**
	 * 时间戳
	 */
	private String timeStamp;

	/**
	 * 返回码
	 */
	private int retCode = -1;

	/**
	 * 一个发送请求只返回一个msgid
	 */
	private String msgid;

	/**
	 * @return the timeStamp
	 */
	public String getTimeStamp() {
		return timeStamp;
	}

	/**
	 * @param timeStamp
	 *            the timeStamp to set
	 */
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	/**
	 * @return the retCode
	 */
	public int getRetCode() {
		return retCode;
	}

	/**
	 * @param retCode
	 *            the retCode to set
	 */
	public void setRetCode(int retCode) {
		this.retCode = retCode;
	}

	/**
	 * @return the msgid
	 */
	public String getMsgid() {
		return msgid;
	}

	/**
	 * @param msgid
	 *            the msgid to set
	 */
	public void setMsgid(String msgid) {
		this.msgid = msgid;
	}

	@Override
	public String toString() {
		return "SendSmsResultBean [timeStamp=" + timeStamp + ", retCode=" + retCode + ", msgid=" + msgid + "]";
	}
}

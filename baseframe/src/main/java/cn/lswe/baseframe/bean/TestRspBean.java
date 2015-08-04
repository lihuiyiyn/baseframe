/**
 * 
 */
package cn.lswe.baseframe.bean;

import cn.lswe.baseframe.bean.base.BaseRsp;

/**
 * @author sam
 */
public class TestRspBean extends BaseRsp {

	private String testStr;

	private String testInteger;

	/**
	 * @return the testStr
	 */
	public String getTestStr() {
		return testStr;
	}

	/**
	 * @param testStr
	 *            the testStr to set
	 */
	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}

	/**
	 * @return the testInteger
	 */
	public String getTestInteger() {
		return testInteger;
	}

	/**
	 * @param testInteger
	 *            the testInteger to set
	 */
	public void setTestInteger(String testInteger) {
		this.testInteger = testInteger;
	}
}

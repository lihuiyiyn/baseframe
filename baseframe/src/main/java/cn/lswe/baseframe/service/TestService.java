/**
 * 
 */
package cn.lswe.baseframe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.lswe.baseframe.bean.TestEntity;
import cn.lswe.baseframe.bean.TestReqBean;
import cn.lswe.baseframe.bean.TestRspBean;
import cn.lswe.baseframe.dao.TestDao;
import cn.lswe.baseframe.handler.BaseException;

/**
 * @author sam
 */
@Component
public class TestService {

	@Autowired
	private TestDao testDao;

	public TestRspBean testService(TestReqBean reqBean) throws BaseException {
		TestRspBean testRspBean = new TestRspBean();
		TestEntity te = new TestEntity();
		te.setAge(reqBean.getAge());
		te.setName(reqBean.getName());
		int retCode = testDao.insert(te);
		retCode = 10;
		if (retCode > 0)
			testRspBean.setTestInteger(retCode + "");
		else
			testRspBean.setTestInteger("-1");
		return testRspBean;
	}
}

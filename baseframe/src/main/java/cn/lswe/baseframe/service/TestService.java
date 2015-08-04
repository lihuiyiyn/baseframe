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

/**
 * @author sam
 */
@Component
public class TestService {

	@Autowired
	private TestDao testDao;

	public TestRspBean testService(TestReqBean reqBean) {
		TestRspBean testRspBean = new TestRspBean();
		TestEntity te = new TestEntity();
		te.setAge(reqBean.getAge());
		te.setName(reqBean.getName());
		// int retCode = testDao.insert(te);
		int retCode = 10;
		if (retCode > 0)
			testRspBean.setTestInteger(retCode + "");
		else
			testRspBean.setTestInteger("-1");
		return testRspBean;
	}
}

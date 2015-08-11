/**
 * 
 */
package cn.lswe.baseframe.service;

import java.util.List;

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
		te.setAge("1024");
		te.setName("MYNAME");
		int retCode = testDao.insert(te);
		System.out.println("insertCode" + retCode);
		te.setAge("2048");
		te.setName("YOURNAME");
		retCode = testDao.update(te);
		System.out.println("updateCode" + retCode);
		List<TestEntity> list = testDao.select();
		for (TestEntity testEntity : list) {
			System.out.println(testEntity);
		}
		retCode = 10;
		if (retCode > 0)
			testRspBean.setTestInteger(retCode + "");
		else
			testRspBean.setTestInteger("-1");
		return testRspBean;
	}
}

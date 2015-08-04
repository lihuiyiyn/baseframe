/**
 * 
 */
package cn.lswe.baseframe.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.lswe.baseframe.bean.TestEntity;

/**
 * @author sam
 */
@Repository
public class TestDao {

	@Autowired
	private SqlSession sqlSession;

	public int insert(TestEntity testEntity) {
		return sqlSession.insert("TestMapper.insert", testEntity);
	}
}

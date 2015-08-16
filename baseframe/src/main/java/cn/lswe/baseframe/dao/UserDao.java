package cn.lswe.baseframe.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.lswe.baseframe.dao.entity.UserEntity;

@Repository
public class UserDao {

	@Autowired
	private SqlSession sqlSession;

	public Object select(UserEntity ue) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("UserMapper.select", ue).get(0);
	}
}

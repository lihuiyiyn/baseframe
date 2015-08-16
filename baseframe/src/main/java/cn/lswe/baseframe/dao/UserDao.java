package cn.lswe.baseframe.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.lswe.baseframe.bean.UserReqBean;

@Repository
public class UserDao {

	@Autowired
	private SqlSession sqlSession;

	public int select(UserReqBean userReqBen) {
		return sqlSession.selectOne("UserMapper.loginRet", userReqBen);
	}
}

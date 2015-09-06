/**
 * 
 */
package cn.lswe.baseframe.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.lswe.baseframe.bean.login.LoginReqBean;

/**
 * @author LauShallwe
 */
@Repository
public class LoginDao {

	@Autowired
	private SqlSession sqlSession;

	/**
	 * @param userReqBen
	 * @return
	 */
	public int login(LoginReqBean loginReqBean) {
		return sqlSession.selectOne("LoginMapper.login", loginReqBean);
	}
}

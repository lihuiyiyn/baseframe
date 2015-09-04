/**
 * 
 */
package cn.lswe.baseframe.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author LauShallwe
 */
@Repository
public class LoginDao {

	@Autowired
	private SqlSession sqlSession;

}

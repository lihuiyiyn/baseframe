/**
 * 
 */
package cn.lswe.baseframe.dao;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.lswe.baseframe.bean.base.BaseUser;
import cn.lswe.baseframe.bean.login.LoginReqBean;
import cn.lswe.baseframe.dao.entity.UserEntity;

/**
 * @author LauShallwe
 */
@Repository
public class LoginDao {

	@Autowired
	private SqlSession sqlSession;

	/**
	 * 获取到用户的基本信息byPhone
	 * 
	 * @param phone
	 * @return
	 */
	public BaseUser getBaseUserByPhone(String phone) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("phone", phone);
		return sqlSession.selectOne("LoginMapper.getBaseUserByPhone", map);
	}

	/**
	 * 获取到用户的基本信息byMail
	 * 
	 * @param mail
	 * @return
	 */
	public BaseUser getBaseUserByMail(String mail) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("mail", mail);
		return sqlSession.selectOne("LoginMapper.getBaseUserByPhone", map);
	}

	/**
	 * @param userReqBen
	 * @return
	 */
	public BaseUser login(LoginReqBean loginReqBean) {
		return sqlSession.selectOne("LoginMapper.login", loginReqBean);
	}

	/**
	 * 根据手机号码查询到用户的基本信息
	 * 
	 * @param phone
	 * @return
	 */
	public UserEntity getSimpleUserByPhone(String phone) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("phone", phone);
		return sqlSession.selectOne("LoginMapper.getUserByPhone", map);
	}
}

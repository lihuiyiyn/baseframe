/**
 * 
 */
package cn.lswe.baseframe.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.lswe.baseframe.dao.entity.UserEntity;

/**
 * @author LauShallwe
 */
@Repository
public class SettingDao {

	@Autowired
	private SqlSession sqlSession;

	/**
	 * 设置用户密码
	 * 
	 * @param userEntity
	 * @return
	 */
	public int setUserCode(UserEntity userEntity) {
		return sqlSession.insert("SettingMapper.setCode", userEntity);
	}

	/**
	 * 更新用户密码
	 * 
	 * @param userEntity
	 * @return
	 */
	public int updateUserCode(UserEntity userEntity) {
		return sqlSession.update("SettingMapper.updateCode", userEntity);
	}

	/**
	 * 更新用户邮箱
	 * 
	 * @param userEntity
	 * @return
	 */
	public int updateUserMail(UserEntity userEntity) {
		return sqlSession.update("SettingMapper.updateMail", userEntity);
	}

}

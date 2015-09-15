/**
 * 
 */
package cn.lswe.baseframe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.lswe.baseframe.bean.LoginUserInfoData;
import cn.lswe.baseframe.bean.UserSettingEmailReqBean;
import cn.lswe.baseframe.bean.UserSettingNickNameReqBean;
//github.com/lswe/baseframe.git
import cn.lswe.baseframe.bean.base.BaseReqBean;
import cn.lswe.baseframe.bean.base.BaseRspBean;
import cn.lswe.baseframe.bean.base.BaseUser;
import cn.lswe.baseframe.bean.setting.AddExpressAddressReqBean;
import cn.lswe.baseframe.bean.setting.AddGroupMemberReqBean;
import cn.lswe.baseframe.bean.setting.DelExpressAddressReqBean;
import cn.lswe.baseframe.bean.setting.DelGroupMemberReqBean;
import cn.lswe.baseframe.bean.setting.LoginSetNewCodeReqBean;
import cn.lswe.baseframe.dao.LoginDao;
import cn.lswe.baseframe.dao.SettingDao;
import cn.lswe.baseframe.dao.entity.UserEntity;
import cn.lswe.baseframe.util.RegexUtil;

/**
 * @author LauShallwe
 */
@Component
public class SettingService {

	@Autowired
	private LoginDao loginDao;

	@Autowired
	private SettingDao settingDao;

	/**
	 * 13208设置登录密码
	 * 
	 * @param loginSetNewCodeReqBean
	 * @return
	 */
	public BaseRspBean loginSerNewCode(LoginSetNewCodeReqBean loginSetNewCodeReqBean) {
		BaseRspBean baseRspBean = new BaseRspBean();
		if (loginSetNewCodeReqBean != null && loginSetNewCodeReqBean.getCode() != null
				&& loginSetNewCodeReqBean.getUser().getPhone() != null) {
			BaseUser baseUser = loginDao.getBaseUserByPhone(loginSetNewCodeReqBean.getUser().getPhone());
			UserEntity ue = new UserEntity();
			ue.setPhone(loginSetNewCodeReqBean.getUser().getPhone());
			ue.setCode(loginSetNewCodeReqBean.getCode());
			if (baseUser == null) {
				settingDao.setUserCode(ue);
			} else {
				settingDao.updateUserCode(ue);
			}
		} else {
			baseRspBean.setError_code(-1);
			baseRspBean.setError_message("参数有误");
		}
		return baseRspBean;
	}

	/**
	 * 13103请求修改昵称
	 * 
	 * @param userSettingNickNameReqBean
	 * @return
	 */
	public BaseRspBean userSettingNickName(UserSettingNickNameReqBean userSettingNickNameReqBean) {
		BaseRspBean baseRspBean = new BaseRspBean();
		// 0.正则匹配昵称是否符合规则
		// 1.根据token到缓存中取用户信息
		// 2.DB中更新昵称
		return baseRspBean;
	}

	/**
	 * 13104请求修改邮件
	 * 
	 * @param userSettingEmailReqBeanF
	 * @return
	 */
	public BaseRspBean userSettingEmail(UserSettingEmailReqBean userSettingEmailReqBean) {
		BaseRspBean baseRspBean = new BaseRspBean();
		System.out.println(userSettingEmailReqBean);
		if (userSettingEmailReqBean != null && userSettingEmailReqBean.getUser() != null) {
			if (!RegexUtil.matchEmail(userSettingEmailReqBean.getEmail())) {
				baseRspBean.setError_code(-1);
				baseRspBean.setError_message("邮件格式有误");
			} else {
				BaseUser baseUser = loginDao.getBaseUserByPhone(userSettingEmailReqBean.getUser().getPhone());
				if (baseUser == null) {
					baseRspBean.setError_code(-1);
					baseRspBean.setError_message("没找到记录，请重新注册");
				} else {
					// 判断邮箱是否已经被别账户使用
					baseUser = loginDao.getBaseUserByMail(userSettingEmailReqBean.getEmail());
					if (baseUser == null) {
						UserEntity ue = new UserEntity();
						ue.setMail(userSettingEmailReqBean.getEmail());
						System.out.println(userSettingEmailReqBean.getEmail());
						ue.setPhone(userSettingEmailReqBean.getUser().getPhone());
						System.out.println(ue);
						settingDao.updateUserMail(ue);
					} else {
						baseRspBean.setError_code(-1);
						baseRspBean.setError_message("邮箱已经被账户注册");
					}
				}
			}
		}
		return baseRspBean;
	}

	/**
	 * 13105请求添加快递地址
	 * 
	 * @param addExpressAddressReqBean
	 * @return
	 */
	public BaseRspBean addExpressAddress(AddExpressAddressReqBean addExpressAddressReqBean) {
		BaseRspBean baseRspBean = new BaseRspBean();
		// 1.根据token到缓存中取用户信息
		// 2.DB中添加快递地址
		return baseRspBean;
	}

	/**
	 * 13106删除快递地址
	 * 
	 * @param delExpressAddressReqBean
	 * @return
	 */
	public BaseRspBean delExpressAddress(DelExpressAddressReqBean delExpressAddressReqBean) {
		BaseRspBean baseRspBean = new BaseRspBean();
		// 1.根据token到缓存中取用户信息
		// 2.DB中添加快递地址
		return baseRspBean;
	}

	/**
	 * 请求添加成员11105
	 * 
	 * @param addGroupMemberReqBean
	 * @return
	 */
	public BaseRspBean addGroupMember(AddGroupMemberReqBean addGroupMemberReqBean) {
		BaseRspBean baseRspBean = new BaseRspBean();
		return baseRspBean;
	}

	/**
	 * 13108删除成员
	 * 
	 * @param delGroupMemberReqBean
	 * @return
	 */
	public BaseRspBean delGroupMember(DelGroupMemberReqBean delGroupMemberReqBean) {
		BaseRspBean baseRspBean = new BaseRspBean();
		return baseRspBean;
	}

	/**
	 * 请求退出账户
	 * 
	 * @param baseReqBean
	 * @return
	 */
	public BaseRspBean exitAccount(BaseReqBean baseReqBean) {
		BaseRspBean baseRspBean = new BaseRspBean();
		return baseRspBean;
	}

	/**
	 * 13310用户设置 获取到用户设置信息
	 * 
	 * @param baseReqBean
	 * @return
	 */
	public BaseRspBean userSettingInfo(BaseReqBean baseReqBean) {
		BaseRspBean baseRspBean = new BaseRspBean();
		// 1.去DB中查询
		// 2.组装返回结果
		// 3.返回设置结果
		// 去数据库中查询验证账号密码没错
		LoginUserInfoData loginUserInfoData = new LoginUserInfoData();
		// 此处放置从DB中查询到的用户信息数据，然后整合到loginUserInfoData
		baseRspBean.setData(loginUserInfoData);
		return baseRspBean;
	}
}

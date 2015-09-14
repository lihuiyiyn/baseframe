/**
 * 
 */
package cn.lswe.baseframe.service;

import org.springframework.stereotype.Component;

import cn.lswe.baseframe.bean.LoginUserInfoData;
import cn.lswe.baseframe.bean.UserSettingEmailReqBean;
import cn.lswe.baseframe.bean.UserSettingNickNameReqBean;
//github.com/lswe/baseframe.git
import cn.lswe.baseframe.bean.base.BaseReqBean;
import cn.lswe.baseframe.bean.base.BaseRspBean;
import cn.lswe.baseframe.bean.setting.AddExpressAddressReqBean;
import cn.lswe.baseframe.bean.setting.AddGroupMemberReqBean;
import cn.lswe.baseframe.bean.setting.DelExpressAddressReqBean;
import cn.lswe.baseframe.bean.setting.DelGroupMemberReqBean;
import cn.lswe.baseframe.bean.setting.LoginSetNewCodeReqBean;
import cn.lswe.baseframe.util.RegexUtil;

/**
 * @author LauShallwe
 */
@Component
public class SettingService {

	/**
	 * 13208设置登录密码
	 * 
	 * @param loginSetNewCodeReqBean
	 * @return
	 */
	public BaseRspBean loginSerNewCode(LoginSetNewCodeReqBean loginSetNewCodeReqBean) {
		BaseRspBean baseRspBean = new BaseRspBean();
		// 0.正则匹配密码是否符合规则
		if (RegexUtil.matchPsw(loginSetNewCodeReqBean.getCode())) {

		} else {

		}
		// 1.根据token到缓存中取用户信息
		// 2.DB中更新密码
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
		// 0.正则匹配邮件地址是否符合规则
		// 1.根据token到缓存中取用户信息
		// 2.DB中更新email
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

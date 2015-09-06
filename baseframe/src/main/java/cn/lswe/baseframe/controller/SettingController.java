/**
 * 
 */
package cn.lswe.baseframe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import cn.lswe.baseframe.bean.UserSettingEmailReqBean;
import cn.lswe.baseframe.bean.UserSettingNickNameReqBean;
import cn.lswe.baseframe.bean.base.BaseReqBean;
import cn.lswe.baseframe.bean.base.BaseRspBean;
import cn.lswe.baseframe.bean.setting.AddExpressAddressReqBean;
import cn.lswe.baseframe.bean.setting.AddGroupMemberReqBean;
import cn.lswe.baseframe.bean.setting.DelExpressAddressReqBean;
import cn.lswe.baseframe.bean.setting.DelGroupMemberReqBean;
import cn.lswe.baseframe.bean.setting.LoginSetNewCodeReqBean;
import cn.lswe.baseframe.service.SettingService;

/**
 * @author LauShallwe
 */
@Controller
public class SettingController {

	@Autowired
	private SettingService settingService;

	/**
	 * 13208设置登录密码
	 * 
	 * @param loginSetNewCodeReqBean
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/v1/login_set_code", produces = "text/html;charset=UTF-8")
	public String loginSetNewCode(LoginSetNewCodeReqBean loginSetNewCodeReqBean) {
		BaseRspBean baseRspBean = settingService.loginSerNewCode(loginSetNewCodeReqBean);
		return JSON.toJSONString(baseRspBean);
	}

	/**
	 * 13103请求修改昵称
	 * 
	 * @param userSettingNickNameReqBean
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/v1/user_setting_nickname", produces = "text/html;charset=UTF-8")
	public String userSettingNickName(UserSettingNickNameReqBean userSettingNickNameReqBean) {
		BaseRspBean baseRspBean = settingService.userSettingNickName(userSettingNickNameReqBean);
		return JSON.toJSONString(baseRspBean);
	}

	/**
	 * 13104请求修改邮件
	 * 
	 * @param userSettingEmailReqBeanF
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/v1/user_setting_email", produces = "text/html;charset=UTF-8")
	public String userSettingEmail(UserSettingEmailReqBean userSettingEmailReqBean) {
		BaseRspBean baseRspBean = settingService.userSettingEmail(userSettingEmailReqBean);
		return JSON.toJSONString(baseRspBean);
	}

	/**
	 * 13105请求添加快递地址
	 * 
	 * @param addExpressAddressReqBean
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/v1/add_express_address", produces = "text/html;charset=UTF-8")
	public String addExpressAddress(AddExpressAddressReqBean addExpressAddressReqBean) {
		BaseRspBean baseRspBean = settingService.addExpressAddress(addExpressAddressReqBean);
		return JSON.toJSONString(baseRspBean);
	}

	/**
	 * 13106删除快递地址
	 * 
	 * @param delExpressAddressReqBean
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/v1/del_express_address", produces = "text/html;charset=UTF-8")
	public String delExpressAddress(DelExpressAddressReqBean delExpressAddressReqBean) {
		BaseRspBean baseRspBean = settingService.delExpressAddress(delExpressAddressReqBean);
		return JSON.toJSONString(baseRspBean);
	}

	/**
	 * 13107添加新成员--> 11105
	 * 
	 * @param addGroupMemberReqBean
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/v1/add_group_member", produces = "text/html;charset=UTF-8")
	public String addGroupMember(AddGroupMemberReqBean addGroupMemberReqBean) {
		BaseRspBean baseRspBean = settingService.addGroupMember(addGroupMemberReqBean);
		return JSON.toJSONString(baseRspBean);
	}

	/**
	 * 13108删除成员
	 * 
	 * @param delGroupMemberReqBean
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/v1/del_group_member", produces = "text/html;charset=UTF-8")
	public String delGroupMember(DelGroupMemberReqBean delGroupMemberReqBean) {
		BaseRspBean baseRspBean = settingService.delGroupMember(delGroupMemberReqBean);
		return JSON.toJSONString(baseRspBean);
	}

	/**
	 * 请求退出账户
	 * 
	 * @param baseReqBean
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/v1/exit_account", produces = "text/html;charset=UTF-8")
	public String exitAccount(BaseReqBean baseReqBean) {
		BaseRspBean baseRspBean = settingService.exitAccount(baseReqBean);
		return JSON.toJSONString(baseRspBean);
	}

	/**
	 * 13310用户设置 获取到用户设置信息
	 * 
	 * @param baseReqBean
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/v1/user_setting_info", produces = "text/html;charset=UTF-8")
	public String userSettingInfo(BaseReqBean baseReqBean) {
		BaseRspBean baseRspBean = settingService.userSettingInfo(baseReqBean);
		return JSON.toJSONString(baseRspBean);
	}
}

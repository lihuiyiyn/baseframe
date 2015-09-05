/**
 * 
 */
package cn.lswe.baseframe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import cn.lswe.baseframe.bean.base.BaseReqBean;
import cn.lswe.baseframe.bean.base.BaseRspBean;
import cn.lswe.baseframe.service.SettingService;

/**
 * @author LauShallwe
 */
@Controller
public class SettingController {

	@Autowired
	private SettingService settingService;

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

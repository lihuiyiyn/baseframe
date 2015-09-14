package cn.lswe.baseframe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lswe.baseframe.bean.user.UpdateUserSettingReqBean;

/**
 * @author sam
 */
@Controller
@RequestMapping("/user")
public class UserController {

	public String updateUserSetting(UpdateUserSettingReqBean updateUserSettingReqBean) {
		return "";
	}
}

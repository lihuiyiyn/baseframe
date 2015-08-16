package cn.lswe.baseframe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import cn.lswe.baseframe.bean.UserReqBean;
import cn.lswe.baseframe.bean.base.BaseRspBean;
import cn.lswe.baseframe.service.UserService;

/**
 * @author sam
 */
@Controller
public class UserController {

	@Autowired
	private UserService userService;

	public String regist() {
		return "";
	}

	@ResponseBody
	@RequestMapping(value = "/user/v1/login", produces = "text/html;charset=UTF-8")
	public String login(UserReqBean userReqBean) {
		System.out.println(userReqBean);
		BaseRspBean baseRspBean = userService.login(userReqBean);
		System.out.println(baseRspBean);
		return JSON.toJSONString(baseRspBean);
	}
}

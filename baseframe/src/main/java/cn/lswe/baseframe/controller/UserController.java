package cn.lswe.baseframe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import cn.lswe.baseframe.bean.LoginByVerifyCodeReqBean;
import cn.lswe.baseframe.bean.UserInfoBean;
import cn.lswe.baseframe.bean.UserReqBean;
import cn.lswe.baseframe.bean.base.BaseReqBean;
import cn.lswe.baseframe.bean.base.BaseRspBean;
import cn.lswe.baseframe.service.UserService;

/**
 * @author sam
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	/**
	 * 3.1 获取用户信息
	 * 
	 * @param reqBean
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/v1/userInfo", produces = "text/html;charset=UTF-8")
	public String userInfo(BaseReqBean baseReqBean) {
		BaseRspBean baseRspBean = userService.userInfo(baseReqBean);
		return JSON.toJSONString(baseRspBean);
	}

	@ResponseBody
	@RequestMapping(value = "/v1/login", produces = "text/html;charset=UTF-8")
	public String login(UserReqBean userReqBean) {
		BaseRspBean baseRspBean = userService.login(userReqBean);
		return JSON.toJSONString(baseRspBean);
	}

	@ResponseBody
	@RequestMapping(value = "/v1/loginByVerifyCode", produces = "text/html;charset=UTF-8")
	public String loginBySms(LoginByVerifyCodeReqBean loginByVerifyCodeReqBean) {
		BaseRspBean baseRspBean = userService.verifyByVerifyCode(loginByVerifyCodeReqBean);
		return JSON.toJSONString(baseRspBean);
	}
}

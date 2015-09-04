/**
 * 
 */
package cn.lswe.baseframe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import cn.lswe.baseframe.bean.LoginByVerifyCodeReqBean;
import cn.lswe.baseframe.bean.LoginReqBean;
import cn.lswe.baseframe.bean.base.BaseRspBean;
import cn.lswe.baseframe.service.LoginService;

/**
 * @author sam
 */
@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@ResponseBody
	@RequestMapping(value = "/v1/login", produces = "text/html;charset=UTF-8")
	public String login(LoginReqBean loginReqBean) {
		BaseRspBean baseRspBean = loginService.login(loginReqBean);
		return JSON.toJSONString(baseRspBean);
	}

	@ResponseBody
	@RequestMapping(value = "/v1/loginByVerifyCode", produces = "text/html;charset=UTF-8")
	public String loginBySms(LoginByVerifyCodeReqBean loginByVerifyCodeReqBean) {
		BaseRspBean baseRspBean = loginService.verifyByVerifyCode(loginByVerifyCodeReqBean);
		return JSON.toJSONString(baseRspBean);
	}
}

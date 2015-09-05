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
import cn.lswe.baseframe.bean.PhoneVerifyCodeReqBean;
import cn.lswe.baseframe.bean.base.BaseRspBean;
import cn.lswe.baseframe.service.LoginService;

/**
 * @author sam
 */
@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	/**
	 * 13200优医就诊登录
	 * 
	 * @param reqBean
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/v1/login", produces = "text/html;charset=UTF-8")
	public String login(LoginReqBean loginReqBean) {
		BaseRspBean baseRspBean = loginService.login(loginReqBean);
		return JSON.toJSONString(baseRspBean);
	}

	/**
	 * 13202短信验证登录
	 * 
	 * @param phoneVerifyCodeReqBean
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/v1/phone_verify_code", produces = "text/html;charset=UTF-8")
	public String phoneVerifyCode(PhoneVerifyCodeReqBean phoneVerifyCodeReqBean) {
		BaseRspBean baseRspBean = loginService.phoneVerifyCode(phoneVerifyCodeReqBean);
		return JSON.toJSONString(baseRspBean);
	}

}

/**
 * 
 */
package cn.lswe.baseframe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import cn.lswe.baseframe.bean.LoginPhoneReqBean;
import cn.lswe.baseframe.bean.LoginReqBean;
import cn.lswe.baseframe.bean.LoginSetCodeReqBean;
import cn.lswe.baseframe.bean.LoginSetEmailReqBean;
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
	 * 13202短信验证登录(获取短信验证码)
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

	/**
	 * 13202短信验证登录(验证短信验证码)
	 * 
	 * @param loginPhoneReqBean
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/v1/login_phone", produces = "text/html;charset=UTF-8")
	public String loginPhone(LoginPhoneReqBean loginPhoneReqBean) {
		BaseRspBean baseRspBean = loginService.loginPhone(loginPhoneReqBean);
		return JSON.toJSONString(baseRspBean);
	}

	/**
	 * 13101设置登录密码
	 * 
	 * @param loginSetCodeReqBean
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/v1/login_set_code", produces = "text/html;charset=UTF-8")
	public String loginSetCode(LoginSetCodeReqBean loginSetCodeReqBean) {
		BaseRspBean baseRspBean = loginService.loginSetCode(loginSetCodeReqBean);
		return JSON.toJSONString(baseRspBean);
	}

	/**
	 * 13102设置邮箱
	 * 
	 * @param loginSetEmailReqBean
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/v1/login_set_mail", produces = "text/html;charset=UTF-8")
	public String loginSetEmail(LoginSetEmailReqBean loginSetEmailReqBean) {
		BaseRspBean baseRspBean = loginService.loginSetEmail(loginSetEmailReqBean);
		return JSON.toJSONString(baseRspBean);
	}
}

/**
 * 
 */
package cn.lswe.baseframe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.lswe.baseframe.bean.LoginReqBean;

/**
 * @author sam
 */
@Controller
public class LoginController {

	@RequestMapping(value = "/login/", produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String login(LoginReqBean loginReqBean) {
		return "";
	}
}

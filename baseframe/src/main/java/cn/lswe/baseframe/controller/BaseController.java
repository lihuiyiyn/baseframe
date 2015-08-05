package cn.lswe.baseframe.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

public class BaseController {

	/** 基于@ExceptionHandler异常处理 */

	@ExceptionHandler
	public @ResponseBody String exp(HttpServletRequest request, Exception ex) {
		System.out.println("error");
		return "error";
	}
}

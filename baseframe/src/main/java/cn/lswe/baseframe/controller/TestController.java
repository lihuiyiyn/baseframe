package cn.lswe.baseframe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import cn.lswe.baseframe.bean.TestReqBean;
import cn.lswe.baseframe.service.TestService;
import cn.lswe.baseframe.validator.AuthorityValidator;
import cn.lswe.baseframe.validator.ChatValidator;

@Controller
public class TestController {

	@Autowired
	private TestService testService;

	@ChatValidator
	@AuthorityValidator
	@ResponseBody
	@RequestMapping("/test/controller")
	public String test(TestReqBean reqBean) {
		return JSON.toJSONString(testService.testService(reqBean));
	}
}

package cn.lswe.baseframe.validator;

import java.io.OutputStreamWriter;
import java.lang.reflect.Method;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;

import cn.lswe.baseframe.bean.base.BaseRspBean;
import cn.lswe.baseframe.bean.base.BaseUser;
import cn.lswe.baseframe.global.Constant;
import cn.lswe.baseframe.util.RedisUtil;

public class BaseInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HandlerMethod handlerMethod = (HandlerMethod) handler;
		Method method = handlerMethod.getMethod();
		ChatValidator annotation = method.getAnnotation(ChatValidator.class);
		if (annotation != null) {
			// 获取到了ChatValidator注解
			String token = request.getHeader("token");
			if (token != null) {
				BaseUser user = RedisUtil.get(token);
				if (user != null) {
					request.setAttribute(Constant.user.LoginUser, user);
					return true;
				}
			}
			// controller方法上有ChatValidator注解但是token或者根据token在redis取到的User为空
			ServletOutputStream out = response.getOutputStream();
			OutputStreamWriter ow = new OutputStreamWriter(out, "UTF-8");
			BaseRspBean baseRspBean = new BaseRspBean();
			baseRspBean.setError_message("会话校验失败");
			baseRspBean.setError_code(-1);
			ow.write(JSON.toJSONString(baseRspBean));
			ow.flush();
			return false;
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	}
}

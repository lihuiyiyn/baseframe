package cn.lswe.baseframe.validator;

import java.io.OutputStreamWriter;
import java.lang.reflect.Method;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import cn.lswe.baseframe.bean.base.BaseUser;
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
			if (token == null) {
				// token字段为空
				ServletOutputStream out = response.getOutputStream();
				OutputStreamWriter ow = new OutputStreamWriter(out, "UTF-8");
				ow.write("no 没有 session");
				ow.flush();
				return false;
			} else {
				BaseUser user = RedisUtil.get(token);
				if (user == null) {
					// token在redis中找不到用户信息
					ServletOutputStream out = response.getOutputStream();
					OutputStreamWriter ow = new OutputStreamWriter(out, "UTF-8");
					ow.write("no 没有 session");
					ow.flush();
					return false;
				} else {
request.
					request.setAttribute("user", user);
					return true;
				}
			}
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

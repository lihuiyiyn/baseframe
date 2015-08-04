package cn.lswe.baseframe.validator;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class BaseInterceptor extends HandlerInterceptorAdapter {

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HandlerMethod handlerMethod = (HandlerMethod) handler;
		Method method = handlerMethod.getMethod();
		// 会话校验
		ChatValidator chatValidatorAnnotation = method.getAnnotation(ChatValidator.class);
		if (chatValidatorAnnotation != null) {
			String accessToken = request.getParameter("access_token");
			if (!accessToken.equals("123")) {
				AuthenticationFailed(response);
				return false;
			}
		}
		AuthorityValidator authorityValidatorAnnotation = method.getAnnotation(AuthorityValidator.class);
		if (authorityValidatorAnnotation != null) {
			System.out.println(getIpAddr(request));
		}
		// 有白名单验证的注解
		return true;
	}

	private void AuthenticationFailed(HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write("No Session or No Authority");
	}

	private String getIpAddr(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		return ip;
	}
}

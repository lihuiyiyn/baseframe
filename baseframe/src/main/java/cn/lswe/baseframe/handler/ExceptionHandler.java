/**
 * 
 */
package cn.lswe.baseframe.handler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author sam
 *
 */
public class ExceptionHandler implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		try {
			PrintWriter writer = response.getWriter();
			String json = "{\"success\":false,\"msg\":\"" + ex.getMessage() + "\"}";
			writer.write(json);
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}

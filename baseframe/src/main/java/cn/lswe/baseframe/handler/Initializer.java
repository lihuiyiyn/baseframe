/**
 * 
 */
package cn.lswe.baseframe.handler;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @author a
 */
@Component("BeanDefineConfigue")
public class Initializer implements ApplicationListener<ContextRefreshedEvent> {

	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println("这个是系统初始化完成之后回调的方法");
	}
}

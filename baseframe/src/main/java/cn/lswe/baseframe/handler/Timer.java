package cn.lswe.baseframe.handler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Timer {

	@Scheduled(cron = "0/5 * * * * ?")
	public void taskCycle() {
		System.out.println("这里可以放定时任务，上面配置的是 每5秒执行一次");
	}
}

/**
 * 
 */
package cn.lswe.baseframe.util;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import cn.lswe.baseframe.bean.extra.EmailBean;

/**
 * @author LauShallwe
 */
public class EmailUtil {

	/**
	 * 测试发邮件方法
	 */
	public static void testSend() {
		EmailBean emailBean = new EmailBean();
		emailBean.setEmail_content("1024社区");
		emailBean.setEmail_subject("512科比");
		emailBean.setFrom_account("shallwe@lswe.cn");
		emailBean.setPass_word("Lau356516");
		emailBean.setTo_account("lswe@vip.qq.com");
		emailBean.setHostname("smtp.mxhichina.com");
		EmailUtil.Send(emailBean);
	}

	@SuppressWarnings("deprecation")
	public static void Send(EmailBean emailBean) {
		SimpleEmail email = new SimpleEmail();
		email.setTLS(true);
		email.setHostName(emailBean.getHostname());
		email.setAuthentication(emailBean.getFrom_account(), emailBean.getPass_word()); // 用户名和密码
		try {
			email.addTo(emailBean.getTo_account()); // 接收方
			email.setFrom(emailBean.getFrom_account()); // 发送方
			email.setSubject(emailBean.getEmail_subject()); // 标题
			email.setCharset("UTF-8");// 邮件编码
			email.setMsg(emailBean.getEmail_content()); // 内容
			email.send();
			System.out.println("success");
		} catch (EmailException e) {
			e.printStackTrace();
		}
	}
}

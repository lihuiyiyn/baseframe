/**
 * 
 */
package cn.lswe.baseframe.util;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.URI;
import org.apache.commons.httpclient.methods.GetMethod;

import cn.lswe.baseframe.bean.extra.SendSmsResultBean;
import cn.lswe.baseframe.bean.extra.SmsBean;
import cn.lswe.baseframe.global.Constant;

/**
 * @author LauShallwe
 */
public class SmsUtil {

	/**
	 * 发送短信入口
	 * 
	 * @param smsBean
	 * @return
	 */
	public static SendSmsResultBean send(SmsBean smsBean) {
		try {
			String retString = batchSend(Constant.sms.url, Constant.sms.account, Constant.sms.pswd, smsBean.getPhone(),
					formSms(smsBean.getContent()), Constant.sms.needstatus, Constant.sms.product, Constant.sms.extno);
			return parseResult(retString);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 
	 * @param uri
	 *            应用地址，类似于http://ip:port/msg/
	 * @param account
	 *            账号
	 * @param pswd
	 *            密码
	 * @param mobiles
	 *            手机号码，多个号码使用","分割
	 * @param content
	 *            短信内容
	 * @param needstatus
	 *            是否需要状态报告，需要true，不需要false
	 * @return 返回值定义参见HTTP协议文档
	 * @throws Exception
	 */
	private static String batchSend(String uri, String account, String pswd, String mobiles, String content,
			boolean needstatus, String product, String extno) throws Exception {
		HttpClient client = new HttpClient();
		GetMethod method = new GetMethod();
		try {
			URI base = new URI(uri, false);
			method.setURI(new URI(base, "HttpBatchSendSM", false));
			method.setQueryString(new NameValuePair[] { new NameValuePair("account", account),
					new NameValuePair("pswd", pswd), new NameValuePair("mobile", mobiles),
					new NameValuePair("needstatus", String.valueOf(needstatus)), new NameValuePair("msg", content),
					new NameValuePair("product", product), new NameValuePair("extno", extno), });
			int result = client.executeMethod(method);
			if (result == HttpStatus.SC_OK) {
				InputStream in = method.getResponseBodyAsStream();
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				byte[] buffer = new byte[1024];
				int len = 0;
				while ((len = in.read(buffer)) != -1) {
					baos.write(buffer, 0, len);
				}
				return URLDecoder.decode(baos.toString(), "UTF-8");
			} else {
				throw new Exception("HTTP ERROR Status: " + method.getStatusCode() + ":" + method.getStatusText());
			}
		} finally {
			method.releaseConnection();
		}

	}

	/**
	 * 拼装短信内容
	 * 
	 * @param verifyCode
	 * @return
	 */
	private static String formSms(String verifyCode) {
		StringBuilder sb = new StringBuilder();
		sb.append("你好，你的验证码为：");
		sb.append(verifyCode);
		sb.append("，5分钟内有效，请完成注册");
		return sb.toString();
	}

	/**
	 * 把短信服务商返回的结果解析成SendSmsResultBean
	 * 
	 * @param str
	 * @return
	 */
	private static SendSmsResultBean parseResult(String str) {
		SendSmsResultBean sendSmsResultBean = new SendSmsResultBean();
		List<String> retList = Arrays.asList(str.split("\n"));
		List<String> fisrtLineList = Arrays.asList(retList.get(0).split(","));
		sendSmsResultBean.setRetCode(Integer.valueOf(fisrtLineList.get(1)));
		sendSmsResultBean.setTimeStamp(fisrtLineList.get(0));
		if (retList.size() == 2) {
			sendSmsResultBean.setMsgid(retList.get(1));
		}
		return sendSmsResultBean;
	}
}

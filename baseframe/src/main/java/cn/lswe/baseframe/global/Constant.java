/**
 * 
 */
package cn.lswe.baseframe.global;

/**
 * @author sam
 * @summary 用来放常量
 */
public interface Constant {

	/**
	 * Redis
	 * 
	 * @author sam
	 */
	public interface redis {
		/**
		 * SERVER
		 */
		public String server = "202.115.12.28";

		/**
		 * PORT
		 */
		public int port = 6379;

		/**
		 * PASSWORD
		 */
		public String password = "090811+a090811+a090811+a090811+a090811+a090811+a090811+a090811+a090811+a090811+a";

		/**
		 * 短信有效期
		 */
		public int SmsExpiryTime = 60 * 5;
	}

	/**
	 * USER 相关的常量
	 * 
	 * @author LauShallwe
	 */
	public interface user {
		public String LoginUser = "loginUser";
	}

	/**
	 * 正则匹配相关的常量
	 * 
	 * @author LauShallwe
	 */
	public interface regex {

		public String emailRx = "^\\s*\\w+(?:\\.{0,1}[\\w-]+)*@[a-zA-Z0-9]+(?:[-.][a-zA-Z0-9]+)*\\.[a-zA-Z]+\\s*$";

		public String phoneRx = "^[1]([3][0-9]{1}|59|58|88|89|84|70)[0-9]{8}$";

		public String verifyCodeRx = "[0-9]{6}";

		public String pswRx = "^[0-9a-zA-Z]{6,16}$";
	}

	/**
	 * 短信相关配置
	 * 
	 * @author LauShallwe
	 */
	public interface sms {

		/**
		 * 其中IP:PORT为服务部署的地址和端口
		 */
		public String url = "http://222.73.117.158/msg/HttpBatchSendSM";

		/**
		 * 必填参数。用户账号
		 */
		public String account = "shangwuA_dyj1";

		/**
		 * 必填参数。用户密码
		 */
		public String pswd = "Tch111222";

		/**
		 * 必填参数。是否需要状态报告，取值true或false，true，表明需要状态报告；false不需要状态报告
		 */
		public boolean needstatus = true;

		/**
		 * 可选参数。用户订购的产品id
		 */
		public String product = "";

		/**
		 * 可选参数，扩展码
		 */
		public String extno = "";
	}

}

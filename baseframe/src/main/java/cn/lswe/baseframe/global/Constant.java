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
		public int SmsExpiryTime = 60 * 3;
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

		public String phoneRx = "^[1]([3][0-9]{1}|59|58|88|89|70)[0-9]{8}$";

	}

}

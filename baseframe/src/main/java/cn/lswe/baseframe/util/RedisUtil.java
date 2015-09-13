/**
 * 
 */
package cn.lswe.baseframe.util;

import com.alibaba.fastjson.JSON;

import cn.lswe.baseframe.bean.base.BaseUser;
import cn.lswe.baseframe.bean.login.VerifyCodeBean;
import cn.lswe.baseframe.global.Constant;
import redis.clients.jedis.Jedis;

/**
 * @author sam
 */
public class RedisUtil {

	/**
	 * 把User对象放到Redis，返回token
	 * 
	 * @param user
	 * @return
	 */
	public static String putUser(BaseUser user) {
		String token = RandomUtil.getToken();
		String retStr = putToken(token, user);
		if ("OK".equals(retStr))
			return token;
		return null;
	}

	/**
	 * 添加Session
	 * 
	 * @param token
	 * @param user
	 * @return
	 */
	public static String putToken(String token, BaseUser user) {
		Jedis jedis = JedisPoolUtil.getJedis();
		String retStr = jedis.set(token, JSON.toJSONString(user));
		JedisPoolUtil.returnRes(jedis);
		return retStr;
	}

	/**
	 * 校验Token
	 * 
	 * @param token
	 * @return
	 */
	public static BaseUser getToken(String token) {
		Jedis jedis = JedisPoolUtil.getJedis();
		String userJson = jedis.get(token);
		JedisPoolUtil.returnRes(jedis);
		BaseUser user = JSON.parseObject(userJson, cn.lswe.baseframe.bean.base.BaseUser.class);
		return user;
	}

	/**
	 * 存短信验证
	 * 
	 * @param phone
	 * @param verifyCodeBean
	 * @return
	 */
	public static String putVerifyCode(String phone, VerifyCodeBean verifyCodeBean) {
		Jedis jedis = JedisPoolUtil.getJedis();
		String retStr = jedis.set(phone, JSON.toJSONString(verifyCodeBean));
		jedis.expire(phone, Constant.redis.SmsExpiryTime);
		JedisPoolUtil.returnRes(jedis);
		return retStr;
	}

	/**
	 * 获取短信验证码
	 * 
	 * @param phone
	 * @return
	 */
	public static VerifyCodeBean getVerifyCode(String phone) {
		Jedis jedis = JedisPoolUtil.getJedis();
		String verifyCodeBeanJson = jedis.get(phone);
		JedisPoolUtil.returnRes(jedis);
		VerifyCodeBean verifyCodeBean = JSON.parseObject(verifyCodeBeanJson,
				cn.lswe.baseframe.bean.login.VerifyCodeBean.class);
		return verifyCodeBean;
	}

	/**
	 * 删除
	 * 
	 * @param key
	 * @return
	 */
	public static long remove(String key) {
		Jedis jedis = JedisPoolUtil.getJedis();
		long retCode = jedis.del(key);
		JedisPoolUtil.returnRes(jedis);
		return retCode;
	}
}

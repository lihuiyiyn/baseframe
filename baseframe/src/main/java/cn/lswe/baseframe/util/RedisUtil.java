/**
 * 
 */
package cn.lswe.baseframe.util;

import com.alibaba.fastjson.JSON;

import cn.lswe.baseframe.bean.base.BaseUser;
import redis.clients.jedis.Jedis;

/**
 * @author sam
 */
public class RedisUtil {

	/**
	 * 添加Session
	 * 
	 * @param token
	 * @param user
	 * @return
	 */
	public static String put(String token, BaseUser user) {
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
	public static BaseUser get(String token) {
		Jedis jedis = JedisPoolUtil.getJedis();
		String userJson = jedis.get(token);
		System.out.println(userJson);
		BaseUser user = JSON.parseObject(userJson, cn.lswe.baseframe.bean.base.BaseUser.class);
		return user;
	}
}

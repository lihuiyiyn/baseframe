/**
 * 
 */
package cn.lswe.baseframe.service;

import org.springframework.stereotype.Component;

import cn.lswe.baseframe.bean.LoginSetNewCodeReqBean;
import cn.lswe.baseframe.bean.base.BaseReqBean;
import cn.lswe.baseframe.bean.base.BaseRspBean;

/**
 * @author LauShallwe
 */
@Component
public class SettingService {

	/**
	 * 13208设置登录密码
	 * 
	 * @param loginSetNewCodeReqBean
	 * @return
	 */
	public BaseRspBean loginSerNewCode(LoginSetNewCodeReqBean loginSetNewCodeReqBean) {
		BaseRspBean baseRspBean = new BaseRspBean();
		// 0.正则匹配密码是否符合规则
		// 1.根据token到缓存中取用户信息
		// 2.DB中更新密码
		return baseRspBean;
	}

	/**
	 * 13310用户设置 获取到用户设置信息
	 * 
	 * @param baseReqBean
	 * @return
	 */
	public BaseRspBean userSettingInfo(BaseReqBean baseReqBean) {
		BaseRspBean baseRspBean = new BaseRspBean();
		// 1.去DB中查询
		// 2.组装返回结果
		// 3.返回设置结果
		return baseRspBean;
	}
}

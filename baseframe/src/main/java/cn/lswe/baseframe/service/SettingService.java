/**
 * 
 */
package cn.lswe.baseframe.service;

import org.springframework.stereotype.Component;

import cn.lswe.baseframe.bean.base.BaseReqBean;
import cn.lswe.baseframe.bean.base.BaseRspBean;

/**
 * @author LauShallwe
 */
@Component
public class SettingService {

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

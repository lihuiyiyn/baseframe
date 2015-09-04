/**
 * 
 */
package cn.lswe.baseframe.service;

import org.springframework.stereotype.Component;

import cn.lswe.baseframe.bean.LoginUserInfoData;
import cn.lswe.baseframe.bean.base.BaseReqBean;
import cn.lswe.baseframe.bean.base.BaseRspBean;

/**
 * @author sam
 */
@Component
public class UserService {

	/**
	 * 3.1 获取用户信息
	 * 
	 * @param baseReqBean
	 * @return
	 */
	public BaseRspBean userInfo(BaseReqBean baseReqBean) {
		BaseRspBean baseRspBean = new BaseRspBean();
		LoginUserInfoData loginUserInfoData = new LoginUserInfoData();
		// 此处放置从DB中查询到的用户信息数据，然后整合到loginUserInfoData
		baseRspBean.setData(loginUserInfoData);
		return baseRspBean;
	}
}

/**
 * 
 */
package cn.lswe.baseframe.service;

import org.springframework.stereotype.Component;

import cn.lswe.baseframe.bean.base.BaseRspBean;
import cn.lswe.baseframe.bean.mydoctor.FavoriteDoctorReqBean;
import cn.lswe.baseframe.bean.mydoctor.SearchDoctorReqBean;

/**
 * @author LauShallwe
 */
@Component
public class MyDoctorService {

	/**
	 * 13303添加医生搜索页
	 * 
	 * @param searchDoctorReqBean
	 * @return
	 */
	public BaseRspBean searchDocotr(SearchDoctorReqBean searchDoctorReqBean) {
		BaseRspBean baseRspBean = new BaseRspBean();
		return baseRspBean;
	}

	/**
	 * 13304删除收藏医生信息
	 * 
	 * @param favoriteDoctorReqBean
	 * @return
	 */
	public BaseRspBean delFavoriteDoctor(FavoriteDoctorReqBean favoriteDoctorReqBean) {
		BaseRspBean baseRspBean = new BaseRspBean();
		return baseRspBean;
	}

	/**
	 * 13305添加收藏医生信息
	 * 
	 * @param favoriteDoctorReqBean
	 * @return
	 */
	public BaseRspBean addFavoriteDoctor(FavoriteDoctorReqBean favoriteDoctorReqBean) {
		BaseRspBean baseRspBean = new BaseRspBean();
		return baseRspBean;
	}
}

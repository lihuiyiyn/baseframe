/**
 * 
 */
package cn.lswe.baseframe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import cn.lswe.baseframe.bean.base.BaseRspBean;
import cn.lswe.baseframe.bean.mydoctor.FavoriteDoctorReqBean;
import cn.lswe.baseframe.bean.mydoctor.SearchDoctorReqBean;
import cn.lswe.baseframe.service.MyDoctorService;

/**
 * @author LauShallwe
 */
@Controller
public class MyDoctorController {

	@Autowired
	private MyDoctorService myDoctorService;

	/**
	 * 13303添加医生搜索页
	 * 
	 * @param searchDoctorReqBean
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/v1/search_doctor", produces = "text/html;charset=UTF-8")
	public String searchDocotr(SearchDoctorReqBean searchDoctorReqBean) {
		BaseRspBean baseRspBean = myDoctorService.searchDocotr(searchDoctorReqBean);
		return JSON.toJSONString(baseRspBean);
	}

	/**
	 * 13304删除收藏医生信息
	 * 
	 * @param favoriteDoctorReqBean
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/v1/del_favorite_doctor", produces = "text/html;charset=UTF-8")
	public String delFavoriteDoctor(FavoriteDoctorReqBean favoriteDoctorReqBean) {
		BaseRspBean baseRspBean = myDoctorService.delFavoriteDoctor(favoriteDoctorReqBean);
		return JSON.toJSONString(baseRspBean);
	}

	/**
	 * 13305添加收藏医生信息
	 * 
	 * @param favoriteDoctorReqBean
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/v1/add_favorite_doctor", produces = "text/html;charset=UTF-8")
	public String addFavoriteDoctor(FavoriteDoctorReqBean favoriteDoctorReqBean) {
		BaseRspBean baseRspBean = myDoctorService.addFavoriteDoctor(favoriteDoctorReqBean);
		return JSON.toJSONString(baseRspBean);
	}
}

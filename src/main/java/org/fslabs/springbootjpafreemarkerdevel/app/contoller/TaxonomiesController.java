/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fslabs.springbootjpafreemarkerdevel.app.contoller;

import java.util.HashMap;

import org.fslabs.springbootjpafreemarkerdevel.app.dto.TaxonomiesDto;
import org.fslabs.springbootjpafreemarkerdevel.app.form.TaxonomiesAdminRegistForm;
import org.fslabs.springbootjpafreemarkerdevel.app.form.TaxonomiesAdminSearchForm;
import org.fslabs.springbootjpafreemarkerdevel.app.service.TaxonomiesService;
import org.fslabs.springbootjpafreemarkerdevel.core.config.AppConf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.SortDefault;
import org.springframework.data.web.SortDefault.SortDefaults;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author kitaz
 */
@Controller
@RequestMapping(value="/admin/taxonomies")
public class TaxonomiesController extends BaseController {
	
	private final String SELF_URI_LOCAL = "/admin/taxonomies";
	
	@Autowired
	private TaxonomiesService _ts;
	
	/**
	 * 初期表示
	 * @param pageable
	 * @param model
	 * @return
	 */
	@RequestMapping(value="", method = {RequestMethod.GET, RequestMethod.POST})
	public String index(
            @PageableDefault(page = 0, size = AppConf.Pager.Limit) 
            @SortDefaults({@SortDefault(sort = "weight", direction = Direction.ASC)}) 
            Pageable pageable,
            @ModelAttribute(value="searchForm") TaxonomiesAdminSearchForm condition,
            @ModelAttribute(value="registForm") TaxonomiesAdminRegistForm reginput,
			Model model
	) {
		
		model = this.getData(pageable, condition, reginput, model);
		
		return "admin_taxonomies";
	}
	
	/**
	 * 検索結果の取得
	 * @param pageable
	 * @param form
	 * @return
	 */
	private Model getData(Pageable pageable, TaxonomiesAdminSearchForm condition, TaxonomiesAdminRegistForm reginput, Model model){
		// map更新
		HashMap<String, Object> map = new HashMap<String, Object>();
				
		// Serviceに処理を渡す
		TaxonomiesDto dto = _ts.searchData(pageable, condition.getHid());
		
		// 条件とdtoを格納
		map.put("condition", condition);
		map.put("reginput", reginput);
		map.put("taxonomies", dto.getTaxonomies().getContent());
		map = this.setAttributeToMap(map);
		// model挿入
		model = super.SetAttributesToModel(model, map);
		
		return model;
	}
	
	/**
	 * Controller共通で使う設定値を格納する
	 *  →Controller共有するために第２引数以降は自由に設定する
	 * @param map
	 * @return
	 */
	private HashMap<String, Object> setAttributeToMap(HashMap<String, Object> map){
		
		map.put("siteTitle", "タクソノミーターム管理");
		
		String[] csss = {};
		String[] jss = {"/app/js/taxonomy.js"};
		
		map.put("csss", csss);
		map.put("jss", jss);
		
		// 自身のuri
		map.put("selfUri", SELF_URI_LOCAL);
				
		return map;
	}
}

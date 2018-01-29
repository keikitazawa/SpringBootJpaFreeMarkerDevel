/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fslabs.springbootjpafreemarkerdevel.app.contoller;

import java.util.HashMap;

import org.fslabs.springbootjpafreemarkerdevel.app.dto.TaxonomyHeadersDto;
import org.fslabs.springbootjpafreemarkerdevel.app.form.TaxonomyAdminRegistForm;
import org.fslabs.springbootjpafreemarkerdevel.app.form.TaxonomyAdminSearchForm;
import org.fslabs.springbootjpafreemarkerdevel.app.service.TaxonomyHeadersService;
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
@RequestMapping(value="/admin/taxonomyheaders")
public class TaxonomyHeadersController extends BaseController {
	
	private final String SELF_URI_LOCAL = "/admin/taxonomyheaders";
	
	@Autowired
	private TaxonomyHeadersService _ths;
	
	/**
	 * 初期表示
	 * @param pageable
	 * @param model
	 * @return
	 */
	
	@RequestMapping(value="", method = {RequestMethod.GET, RequestMethod.POST})
	public String index(
            @PageableDefault(page = 0, size = AppConf.Pager.Limit) 
            @SortDefaults({@SortDefault(sort = "name", direction = Direction.ASC)}) 
            Pageable pageable,
            @ModelAttribute(value="searchForm") TaxonomyAdminSearchForm condition,
            @ModelAttribute(value="registForm") TaxonomyAdminRegistForm reginput,
			Model model
	) {
		
		model = this.getData(pageable, condition, reginput, model);
		
		return "admin_taxonomy_headers";
	}
	
	/**
	 * 検索結果の取得
	 * @param pageable
	 * @param form
	 * @return
	 */
	private Model getData(Pageable pageable, TaxonomyAdminSearchForm condition, TaxonomyAdminRegistForm reginput, Model model){
		// map更新
		HashMap<String, Object> map = new HashMap<String, Object>();
				
		// Serviceに処理を渡す
		TaxonomyHeadersDto dto = _ths.searchData(pageable, condition);
		
		// 条件とdtoを格納
		map.put("condition", condition);
		map.put("reginput", reginput);
		map.put("taxonomyHeaders", dto.getTaxonomyHeader().getContent());
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
		
		map.put("siteTitle", "タクソノミー管理");
		
		String[] csss = {};
		String[] jss = {"/app/js/taxonomy.js"};
		
		map.put("csss", csss);
		map.put("jss", jss);
		
		// 自身のuri
		map.put("selfUri", SELF_URI_LOCAL);
				
		return map;
	}
}

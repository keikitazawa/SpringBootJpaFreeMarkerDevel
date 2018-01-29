/**
 * 
 */
package org.fslabs.springbootjpafreemarkerdevel.app.contoller;

import java.util.HashMap;

import org.springframework.ui.Model;

/**
 * @author kitaz
 *
 */
public class BaseController {
	
	/**
	 * modelにテンプレート用の属性を一括設置する
	 * @param model
	 * @param map
	 * @return
	 */
	protected Model SetAttributesToModel(Model model, HashMap<String, Object> map) {
		model.addAllAttributes(map);
		return model;
	}
	
}

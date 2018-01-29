/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fslabs.springbootjpafreemarkerdevel.app.dto;

import org.fslabs.springbootjpafreemarkerdevel.app.entity.Taxonomy;
import org.springframework.data.domain.Page;


/**
 * タクソノミーグループのエンティティ
 * @author kitaz
 */
public class TaxonomiesDto {
	
	private Page<Taxonomy> Taxonomy;

	/**
	 * @return taxonomies
	 */
	public Page<Taxonomy> getTaxonomies() {
		return Taxonomy;
	}

	/**
	 * @param taxonomy セットする taxonomies
	 */
	public void setTaxonomies(Page<Taxonomy> taxonomy) {
		Taxonomy = taxonomy;
	}


}

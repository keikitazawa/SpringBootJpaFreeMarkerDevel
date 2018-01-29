/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fslabs.springbootjpafreemarkerdevel.app.dto;

import org.fslabs.springbootjpafreemarkerdevel.app.entity.TaxonomyRelation;
import org.springframework.data.domain.Page;


/**
 * タクソノミーグループのエンティティ
 * @author kitaz
 */
public class TaxonomyRelationsDto {
	
	private Page<TaxonomyRelation> TaxonomyRelations;

	/**
	 * @return taxonomyRelations
	 */
	public Page<TaxonomyRelation> getTaxonomyRelations() {
		return TaxonomyRelations;
	}

	/**
	 * @param taxonomyRelations セットする taxonomyRelations
	 */
	public void setTaxonomyRelations(Page<TaxonomyRelation> taxonomyRelations) {
		TaxonomyRelations = taxonomyRelations;
	}

}

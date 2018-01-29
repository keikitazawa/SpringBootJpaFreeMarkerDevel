/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fslabs.springbootjpafreemarkerdevel.app.dto;

import org.fslabs.springbootjpafreemarkerdevel.app.entity.TaxonomyHeader;
import org.springframework.data.domain.Page;


/**
 * タクソノミーグループのエンティティ
 * @author kitaz
 */
public class TaxonomyHeadersDto {
	
	private Page<TaxonomyHeader> taxonomyHeader;

	public Page<TaxonomyHeader> getTaxonomyHeader() {
		return taxonomyHeader;
	}

	public void setTaxonomyHeader(Page<TaxonomyHeader> taxonomyHeader) {
		this.taxonomyHeader = taxonomyHeader;
	}
	
}

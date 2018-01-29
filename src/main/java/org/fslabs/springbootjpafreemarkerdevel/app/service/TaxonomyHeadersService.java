package org.fslabs.springbootjpafreemarkerdevel.app.service;

import org.fslabs.springbootjpafreemarkerdevel.app.dto.TaxonomyHeadersDto;
import org.fslabs.springbootjpafreemarkerdevel.app.entity.TaxonomyHeader;
import org.fslabs.springbootjpafreemarkerdevel.app.form.TaxonomyAdminSearchForm;
import org.fslabs.springbootjpafreemarkerdevel.app.repository.TaxonomyHeadersRepository;
import org.fslabs.springbootjpafreemarkerdevel.app.repository.TaxonomyHeadersRepository.Specifications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * 
 * @author kitaz
 *
 */
@Service
public class TaxonomyHeadersService {

	@Autowired
	private TaxonomyHeadersRepository _thr;
	
	public TaxonomyHeadersDto searchData(Pageable pageable, TaxonomyAdminSearchForm condition){
		// 検索処理
		Page<TaxonomyHeader> ret = _thr.findAll(Specifications.keywordContain(condition.getKeyword()), pageable);
		// dto
		TaxonomyHeadersDto dto = new TaxonomyHeadersDto();
		dto.setTaxonomyHeader(ret);
		return dto;
	}
}

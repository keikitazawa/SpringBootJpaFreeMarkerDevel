package org.fslabs.springbootjpafreemarkerdevel.app.service;

import org.fslabs.springbootjpafreemarkerdevel.app.dto.TaxonomiesDto;
import org.fslabs.springbootjpafreemarkerdevel.app.entity.Taxonomy;
import org.fslabs.springbootjpafreemarkerdevel.app.repository.TaxonomiesRepository;
import org.fslabs.springbootjpafreemarkerdevel.app.repository.TaxonomiesRepository.Specifications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class TaxonomiesService {

	@Autowired
	private TaxonomiesRepository _tr;
	
	public TaxonomiesDto searchData(Pageable pageable, String hid){
		
		// KNOW : ページネーションを使う場合は最後にPageableを入れる
		Page<Taxonomy> ret = _tr.findAll(Specifications.keywordContain(hid), pageable);
		// dto
		TaxonomiesDto dto = new TaxonomiesDto();
		dto.setTaxonomies(ret);
		return dto;
	}
}

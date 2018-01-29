package org.fslabs.springbootjpafreemarkerdevel.app.service;

import java.util.Objects;

import org.fslabs.springbootjpafreemarkerdevel.app.dto.TaxonomyRelationsDto;
import org.fslabs.springbootjpafreemarkerdevel.app.entity.TaxonomyRelation;
import org.fslabs.springbootjpafreemarkerdevel.app.repository.TaxonomyRelationsRepository;
import org.fslabs.springbootjpafreemarkerdevel.app.repository.TaxonomyRelationsRepository.Specifications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class TaxonomyRelationsService {

	@Autowired
	private TaxonomyRelationsRepository _trr;
	
	public TaxonomyRelationsDto searchData(Pageable pageable, String pid){
		
		String targetUuid = null;//AppConf.Uuid.NoData;
		if (Objects.nonNull(pid)) {
			targetUuid = pid;
		}
		Page<TaxonomyRelation> ret = _trr.findAll(Specifications.searchPid(targetUuid), pageable);
		
		// dto
		TaxonomyRelationsDto dto = new TaxonomyRelationsDto();
		dto.setTaxonomyRelations(ret);
		return dto;
	}
}

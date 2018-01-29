package org.fslabs.springbootjpafreemarkerdevel.app.repository;

import java.util.Objects;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.fslabs.springbootjpafreemarkerdevel.app.entity.TaxonomyHeader;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxonomyHeadersRepository extends JpaRepository<TaxonomyHeader, String>, JpaSpecificationExecutor<TaxonomyHeader> {

	/**
	 * 
	 * @author kitaz
	 *
	 */
	public class Specifications {
		
		public static Specification<TaxonomyHeader> keywordContain(final String keyword){
			return new Specification<TaxonomyHeader>() {

				@Override
				public Predicate toPredicate(Root<TaxonomyHeader> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
					String target = "";
					if (Objects.nonNull(keyword)) {
						target = keyword;
					}
					
					Predicate c1 = cb.like(root. <String>get("name"),        "%" + target + "%");
					Predicate c2 = cb.like(root. <String>get("taxonomy"),    "%" + target + "%");
					Predicate c3 = cb.like(root. <String>get("description"), "%" + target + "%");
					Predicate p = cb.or(c1, c2, c3);
					return p;
				}
				
			};
		}
		
	}

}

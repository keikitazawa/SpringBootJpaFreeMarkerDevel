package org.fslabs.springbootjpafreemarkerdevel.app.repository;

import java.util.Objects;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.fslabs.springbootjpafreemarkerdevel.app.entity.Taxonomy;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
//@Transactional
public interface TaxonomiesRepository extends PagingAndSortingRepository<Taxonomy, Integer>, JpaSpecificationExecutor<Taxonomy> {

	/**
	 * 
	 * @author kitaz
	 *
	 */
	public class Specifications {
		
		public static Specification<Taxonomy> keywordContain(final String hid){
			return new Specification<Taxonomy>() {

				@Override
				public Predicate toPredicate(Root<Taxonomy> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
					String target = "";
					Predicate p = null;
					if (Objects.nonNull(hid)) {
						Predicate c1 = cb.like(root. <String>get("hid"), "%" + target + "%");
						p = cb.or(c1);
					}
					return p;
				}
			};
		}
	}
}



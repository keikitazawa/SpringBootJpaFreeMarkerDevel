package org.fslabs.springbootjpafreemarkerdevel.app.repository;

import java.util.Objects;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.fslabs.springbootjpafreemarkerdevel.app.entity.TaxonomyRelation;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxonomyRelationsRepository extends PagingAndSortingRepository<TaxonomyRelation, Integer>, JpaSpecificationExecutor<TaxonomyRelation> {

	/**
	 * 
	 * @author kitaz
	 *
	 */
	public class Specifications {
		
		public static Specification<TaxonomyRelation> searchPid(final String pid){
			return new Specification<TaxonomyRelation>() {

				@Override
				public Predicate toPredicate(Root<TaxonomyRelation> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
					Predicate p = null;
					if (Objects.nonNull(pid)) {
						p = cb.equal(root.get("pid"), pid);
					}
					return p;
				}
				
			};
		}
		
	}
}



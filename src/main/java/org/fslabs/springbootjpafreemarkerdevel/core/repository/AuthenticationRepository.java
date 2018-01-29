package org.fslabs.springbootjpafreemarkerdevel.core.repository;

import org.fslabs.springbootjpafreemarkerdevel.core.entity.AuthenticationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthenticationRepository extends JpaRepository<AuthenticationEntity, String>, JpaSpecificationExecutor<AuthenticationEntity>  {

    AuthenticationEntity findOneByEmailAndDeletedIsNull(String email);
}

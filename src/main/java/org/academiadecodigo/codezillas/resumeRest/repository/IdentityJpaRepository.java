package org.academiadecodigo.codezillas.resumeRest.repository;

import org.academiadecodigo.codezillas.resumeRest.domainModel.identity.Identity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdentityJpaRepository extends JpaRepository<Identity, Integer> {

}

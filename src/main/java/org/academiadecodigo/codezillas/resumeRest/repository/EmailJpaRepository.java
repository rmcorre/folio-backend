package org.academiadecodigo.codezillas.resumeRest.repository;

import org.academiadecodigo.codezillas.resumeRest.domainModel.contact.Email;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailJpaRepository extends JpaRepository<Email, Integer> {
}

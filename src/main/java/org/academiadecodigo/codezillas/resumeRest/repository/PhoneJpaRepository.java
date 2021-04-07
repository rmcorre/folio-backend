package org.academiadecodigo.codezillas.resumeRest.repository;

import org.academiadecodigo.codezillas.resumeRest.domainModel.contact.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneJpaRepository extends JpaRepository<Phone, Integer> {
}

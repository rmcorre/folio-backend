package org.academiadecodigo.codezillas.resumeRest.repository;

import org.academiadecodigo.codezillas.resumeRest.domainModel.contact.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressJpaRepository extends JpaRepository<Address, Integer> {
}

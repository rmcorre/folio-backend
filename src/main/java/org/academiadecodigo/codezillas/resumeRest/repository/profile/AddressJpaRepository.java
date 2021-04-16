package org.academiadecodigo.codezillas.resumeRest.repository.profile;

import org.academiadecodigo.codezillas.resumeRest.domainModel.profile.identity.contact.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressJpaRepository extends JpaRepository<Address, Integer> {
}

package org.academiadecodigo.codezillas.resumeRest.repository.profile;

import org.academiadecodigo.codezillas.resumeRest.domainModel.profile.identity.contact.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneJpaRepository extends JpaRepository<Phone, Integer> {
}

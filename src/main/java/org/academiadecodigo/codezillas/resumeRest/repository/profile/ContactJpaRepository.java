package org.academiadecodigo.codezillas.resumeRest.repository.profile;

import org.academiadecodigo.codezillas.resumeRest.domainModel.profile.identity.contact.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactJpaRepository extends JpaRepository<Contact, Integer> {
}

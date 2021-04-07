package org.academiadecodigo.codezillas.resumeRest.repository;

import org.academiadecodigo.codezillas.resumeRest.domainModel.contact.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactJpaRepository extends JpaRepository<Contact, Integer> {
}

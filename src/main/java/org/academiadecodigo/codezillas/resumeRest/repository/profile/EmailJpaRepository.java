package org.academiadecodigo.codezillas.resumeRest.repository.profile;

import org.academiadecodigo.codezillas.resumeRest.domain.profile.identity.contact.Email;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailJpaRepository extends JpaRepository<Email, Integer> {
}

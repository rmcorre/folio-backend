package org.academiadecodigo.codezillas.resumeRest.repository.profile;

import org.academiadecodigo.codezillas.resumeRest.domainModel.profile.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileJpaRepository extends JpaRepository<Profile, Integer> {
}

package org.academiadecodigo.codezillas.resumeRest.repository.profile;

import org.academiadecodigo.codezillas.resumeRest.domainModel.profile.summary.Summary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SummaryJpaRepository extends JpaRepository<Summary, Integer> {
}

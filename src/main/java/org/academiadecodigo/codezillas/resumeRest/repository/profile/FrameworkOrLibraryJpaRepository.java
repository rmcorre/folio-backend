package org.academiadecodigo.codezillas.resumeRest.repository.profile;

import org.academiadecodigo.codezillas.resumeRest.domainModel.profile.frameworkOrLibrary.FrameworkOrLibrary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FrameworkOrLibraryJpaRepository extends JpaRepository<FrameworkOrLibrary, Integer> {
}

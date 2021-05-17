package org.academiadecodigo.codezillas.resumeRest.service.profile.workExperience;

import org.academiadecodigo.codezillas.resumeRest.domain.profile.workExperience.WorkExperience;

import java.util.Set;

public interface WorkExperienceSvc {

    Set<WorkExperience> getWorkExperiences();

    WorkExperience getWorkExperience(Integer id);
}

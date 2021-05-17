package org.academiadecodigo.codezillas.resumeRest.service.profile.workExperience;

import org.academiadecodigo.codezillas.resumeRest.domain.profile.workExperience.WorkExperience;
import org.academiadecodigo.codezillas.resumeRest.repository.profile.WorkExperienceJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Transactional
public class WorkExperienceSvcImpl implements WorkExperienceSvc {

    private final WorkExperienceJpaRepository workExperienceJpaRepository;

    @Autowired
    public WorkExperienceSvcImpl(WorkExperienceJpaRepository workExperienceJpaRepository) {
        this.workExperienceJpaRepository = workExperienceJpaRepository;
    }

    @Override
    public Set<WorkExperience> getWorkExperiences() {
        return new HashSet<>(workExperienceJpaRepository.findAll());
    }

    @Override
    public WorkExperience getWorkExperience(Integer id) {

        Optional<WorkExperience> result = workExperienceJpaRepository.findById(id);

        WorkExperience workExperience = null;
        if (result.isPresent()) {
            workExperience = result.get();
        }

        return workExperience;
    }

    public WorkExperienceJpaRepository getWorkExperienceJpaRepository() {
        return workExperienceJpaRepository;
    }
}

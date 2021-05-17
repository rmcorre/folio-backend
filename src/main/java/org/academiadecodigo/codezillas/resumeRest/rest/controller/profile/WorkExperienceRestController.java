package org.academiadecodigo.codezillas.resumeRest.rest.controller.profile;

import org.academiadecodigo.codezillas.resumeRest.domain.profile.workExperience.WorkExperience;
import org.academiadecodigo.codezillas.resumeRest.service.profile.workExperience.WorkExperienceSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Set;

@RestController
@RequestMapping("/")
public class WorkExperienceRestController {

    private final WorkExperienceSvc workExperienceSvc;

    @Autowired
    public WorkExperienceRestController(WorkExperienceSvc workExperienceSvc) {
        this.workExperienceSvc = workExperienceSvc;
    }

    @GetMapping("/workExperiences")
    public Set<WorkExperience> getWorkExperiences() {
        return workExperienceSvc.getWorkExperiences();
    }

    @GetMapping("/workExperiences/{id}")
    public WorkExperience getWorkExperience(@PathVariable Integer id) {
        return workExperienceSvc.getWorkExperience(id);
    }
}

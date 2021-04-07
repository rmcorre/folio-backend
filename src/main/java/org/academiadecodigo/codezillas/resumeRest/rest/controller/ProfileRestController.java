package org.academiadecodigo.codezillas.resumeRest.rest.controller;

import org.academiadecodigo.codezillas.resumeRest.domainModel.profile.Profile;
import org.academiadecodigo.codezillas.resumeRest.service.profile.ProfileSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/api")
public class ProfileRestController {

    private final ProfileSvc profileSvc;

    @Autowired
    public ProfileRestController(ProfileSvc profileSvc) {
        this.profileSvc = profileSvc;
    }

    @GetMapping("/profiles")
    public Set<Profile> getProfiles() {
        return profileSvc.getProfiles();
    }

    @GetMapping("/profiles/{id}")
    public Profile getProfile(@PathVariable Integer id) {
        return profileSvc.getProfile(id);
    }
}

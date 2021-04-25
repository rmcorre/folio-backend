package org.academiadecodigo.codezillas.resumeRest.rest.controller.profile;

import org.academiadecodigo.codezillas.resumeRest.domain.profile.Profile;
import org.academiadecodigo.codezillas.resumeRest.service.profile.ProfileSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/")
public class ProfileRestController {

    private final ProfileSvc profileSvc;

    @Autowired
    public ProfileRestController(ProfileSvc profileSvc) {
        this.profileSvc = profileSvc;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/profiles")
    public Set<Profile> getProfiles() {
        return profileSvc.getProfiles();
    }

    @GetMapping("/profiles/{id}")
    public Profile getProfile(@PathVariable Integer id) {
        return profileSvc.getProfile(id);
    }
}

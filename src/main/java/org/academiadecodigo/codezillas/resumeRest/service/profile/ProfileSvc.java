package org.academiadecodigo.codezillas.resumeRest.service.profile;

import org.academiadecodigo.codezillas.resumeRest.domain.profile.Profile;

import java.util.Set;

public interface ProfileSvc {

    Set<Profile> getProfiles();

    Profile getProfile(Integer id);
}

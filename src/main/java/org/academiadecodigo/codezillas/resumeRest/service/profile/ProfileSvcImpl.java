package org.academiadecodigo.codezillas.resumeRest.service.profile;

import org.academiadecodigo.codezillas.resumeRest.repository.profile.ProfileJpaRepository;
import org.academiadecodigo.codezillas.resumeRest.domainModel.profile.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Set;

@Service
@Transactional
public class ProfileSvcImpl implements ProfileSvc {

    private final ProfileJpaRepository profileJpaRepository;

    @Autowired
    public ProfileSvcImpl(ProfileJpaRepository profileJpaRepository) {
        this.profileJpaRepository = profileJpaRepository;
    }

    @Override
    public Set<Profile> getProfiles() {
        return new HashSet<>(profileJpaRepository.findAll());
    }

    @Override
    public Profile getProfile(Integer id) {
        return profileJpaRepository.getOne(id);
    }
}

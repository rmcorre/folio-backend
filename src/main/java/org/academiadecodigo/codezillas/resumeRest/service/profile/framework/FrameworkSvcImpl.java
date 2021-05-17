package org.academiadecodigo.codezillas.resumeRest.service.profile.frameworkOrLibrary;

import org.academiadecodigo.codezillas.resumeRest.domain.profile.industry.Framework;
import org.academiadecodigo.codezillas.resumeRest.repository.profile.FrameworkJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Transactional
public class FrameworkSvcImpl implements FrameworkSvc {

    private FrameworkJpaRepository frameworkJpaRepository;

    @Autowired
    public FrameworkSvcImpl(FrameworkJpaRepository frameworkJpaRepository) {
        this.frameworkJpaRepository = frameworkJpaRepository;
    }

    @Override
    public Set<Framework> getFrameworksOrLibraries() {
        return new HashSet<>(frameworkJpaRepository.findAll());
    }

    @Override
    public Framework getFrameworkOrLibrary(Integer id) {

        Optional<Framework> result = frameworkJpaRepository.findById(id);

        Framework framework = null;
        if (result.isPresent()) {
            framework = result.get();
        }
        
        return framework;
    }
}

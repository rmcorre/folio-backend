package org.academiadecodigo.codezillas.resumeRest.service.profile.frameworkOrLibrary;

import org.academiadecodigo.codezillas.resumeRest.domain.profile.frameworkOrLibrary.FrameworkOrLibrary;
import org.academiadecodigo.codezillas.resumeRest.repository.profile.FrameworkOrLibraryJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Transactional
public class FrameworkOrLibrarySvcImpl implements FrameworkOrLibrarySvc {

    private FrameworkOrLibraryJpaRepository frameworkOrLibraryJpaRepository;

    @Autowired
    public FrameworkOrLibrarySvcImpl(FrameworkOrLibraryJpaRepository frameworkOrLibraryJpaRepository) {
        this.frameworkOrLibraryJpaRepository = frameworkOrLibraryJpaRepository;
    }

    @Override
    public Set<FrameworkOrLibrary> getFrameworksOrLibraries() {
        return new HashSet<>(frameworkOrLibraryJpaRepository.findAll());
    }

    @Override
    public FrameworkOrLibrary getFrameworkOrLibrary(Integer id) {

        Optional<FrameworkOrLibrary> result = frameworkOrLibraryJpaRepository.findById(id);

        FrameworkOrLibrary frameworkOrLibrary = null;
        if (result.isPresent()) {
            frameworkOrLibrary = result.get();
        }
        
        return frameworkOrLibrary;
    }
}

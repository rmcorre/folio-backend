package org.academiadecodigo.codezillas.resumeRest.service.profile.name;

import org.academiadecodigo.codezillas.resumeRest.repository.profile.NameJpaRepository;
import org.academiadecodigo.codezillas.resumeRest.domainModel.profile.identity.name.Name;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Transactional
public class NameSvcImpl implements NameSvc {

    private final NameJpaRepository nameJpaRepository;

    @Autowired
    public NameSvcImpl(NameJpaRepository nameJpaRepository) {
        this.nameJpaRepository = nameJpaRepository;
    }

    @Override
    public Set<Name> getNames() {
        return new HashSet<>(nameJpaRepository.findAll());
    }

    @Override
    public Name getName(Integer id) {

        Optional<Name> result = nameJpaRepository.findById(id);

        Name name = null;
        if (result.isPresent()) {
            name = result.get();
        }
        return name;
    }
}

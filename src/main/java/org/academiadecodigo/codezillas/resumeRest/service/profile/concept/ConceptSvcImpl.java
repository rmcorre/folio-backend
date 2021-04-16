package org.academiadecodigo.codezillas.resumeRest.service.profile.concept;

import org.academiadecodigo.codezillas.resumeRest.domainModel.profile.concept.Concept;
import org.academiadecodigo.codezillas.resumeRest.repository.profile.ConceptJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Transactional
public class ConceptSvcImpl implements ConceptSvc {

    private final ConceptJpaRepository conceptJpaRepository;

    @Autowired
    public ConceptSvcImpl(ConceptJpaRepository conceptJpaRepository) {
        this.conceptJpaRepository = conceptJpaRepository;
    }

    @Override
    public Set<Concept> getConcepts() {
        return new HashSet<>(conceptJpaRepository.findAll());
    }

    @Override
    public Concept getConcept(Integer id) {

        Optional<Concept> result = conceptJpaRepository.findById(id);

        Concept concept = null;
        if (result.isPresent()) {
            concept = result.get();
        }

        return concept;
    }
}

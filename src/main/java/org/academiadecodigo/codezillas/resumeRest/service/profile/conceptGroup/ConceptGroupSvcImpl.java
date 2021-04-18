package org.academiadecodigo.codezillas.resumeRest.service.profile.conceptGroup;

import org.academiadecodigo.codezillas.resumeRest.domainModel.profile.concept.ConceptGroup;
import org.academiadecodigo.codezillas.resumeRest.repository.profile.ConceptGroupJapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
@Transactional
public class ConceptGroupSvcImpl implements ConceptGroupSvc {

    private final ConceptGroupJapRepository conceptGroupJapRepository;

    @Autowired
    public ConceptGroupSvcImpl(ConceptGroupJapRepository conceptGroupJapRepository) {
        this.conceptGroupJapRepository = conceptGroupJapRepository;
    }

    @Override
    public List<ConceptGroup> getConceptGroups() {
        return conceptGroupJapRepository.findAll();
    }

    @Override
    public ConceptGroup getConceptGroup(Integer id) {

        Optional<ConceptGroup> result = conceptGroupJapRepository.findById(id);

        ConceptGroup conceptGroup = null;
        if (result.isPresent()) {
            conceptGroup = result.get();
        }

        return conceptGroup;
    }
}

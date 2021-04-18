package org.academiadecodigo.codezillas.resumeRest.service.profile.conceptGroup;

import org.academiadecodigo.codezillas.resumeRest.domainModel.profile.concept.ConceptGroup;

import java.util.List;
import java.util.Set;

public interface ConceptGroupSvc {

    List<ConceptGroup> getConceptGroups();

    ConceptGroup getConceptGroup(Integer id);
}

package org.academiadecodigo.codezillas.resumeRest.service.profile.concept;

import org.academiadecodigo.codezillas.resumeRest.domainModel.profile.concept.Concept;

import java.util.Set;

public interface ConceptSvc {

    Set<Concept> getConcepts();

    Concept getConcept(Integer id);
}

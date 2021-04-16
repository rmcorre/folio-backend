package org.academiadecodigo.codezillas.resumeRest.rest.controller.profile;

import org.academiadecodigo.codezillas.resumeRest.domainModel.profile.concept.Concept;
import org.academiadecodigo.codezillas.resumeRest.service.profile.concept.ConceptSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/")
public class ConceptRestCtrl {

    private final ConceptSvc conceptSvc;

    @Autowired
    public ConceptRestCtrl(ConceptSvc conceptSvc) {
        this.conceptSvc = conceptSvc;
    }

    @GetMapping("/concepts")
    public Set<Concept> getConcepts() {
        return conceptSvc.getConcepts();
    }

    @GetMapping("/concepts/{id}")
    public Concept getConcept(@PathVariable Integer id) {
        return conceptSvc.getConcept(id);
    }
}

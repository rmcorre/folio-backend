package org.academiadecodigo.codezillas.resumeRest.rest.controller.profile;

import org.academiadecodigo.codezillas.resumeRest.domainModel.profile.concept.ConceptGroup;
import org.academiadecodigo.codezillas.resumeRest.service.profile.conceptGroup.ConceptGroupSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/")
public class ConceptGroupRestController {

    private final ConceptGroupSvc conceptGroupSvc;

    @Autowired
    public ConceptGroupRestController(ConceptGroupSvc conceptGroupSvc) {
        this.conceptGroupSvc = conceptGroupSvc;
    }

    @GetMapping("/conceptGroups")
    List<ConceptGroup> getConceptGroups() {
        return conceptGroupSvc.getConceptGroups();
    }

    @GetMapping("/conceptGroups/{id}")
    ConceptGroup getConceptGroup(@PathVariable Integer id) {
        return conceptGroupSvc.getConceptGroup(id);
    }
}

package org.academiadecodigo.codezillas.resumeRest.domainModel.profile.concept;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.academiadecodigo.codezillas.resumeRest.domainModel.AbstractModel;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class ConceptGroup extends AbstractModel {

    private String conceptGroupName;

    @OneToMany(
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "concept_group_id")
    private final List<Concept> concepts = new ArrayList<>();

    public String getConceptGroupName() {
        return conceptGroupName;
    }

    public void setConceptGroupName(String conceptGroupName) {
        this.conceptGroupName = conceptGroupName;
    }

    public List<Concept> getConcepts() {
        return concepts;
    }

    //    public void addConcept(Concept concept) {
//        concepts.add(concept);
//        concept.setConceptGroup(this);
//    }
//
//    public void removeConcept(Concept concept) {
//        concepts.remove(concept);
//        concept.setConceptGroup(null);
//    }

    @Override
    public String toString() {
        return "ConceptGroup{" +
                "conceptGroupName='" + conceptGroupName + '\'' +
                "} " + super.toString();
    }
}

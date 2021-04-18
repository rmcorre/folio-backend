package org.academiadecodigo.codezillas.resumeRest.domainModel.profile.concept;

import org.academiadecodigo.codezillas.resumeRest.domainModel.AbstractModel;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Entity
public class Concept extends AbstractModel {

    private String term;

//    @ManyToOne(
//            optional = false,
//            fetch = FetchType.EAGER,
//            cascade = CascadeType.ALL
//    )
//    ConceptGroup conceptGroup;

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

//    public ConceptGroup getConceptGroup() {
//        return conceptGroup;
//    }
//
//    public void setConceptGroup(ConceptGroup conceptGroup) {
//        this.conceptGroup = conceptGroup;
//    }

    @Override
    public String toString() {
        return "Concept{" +
                "term='" + term + '\'' +
                "} " + super.toString();
    }
}

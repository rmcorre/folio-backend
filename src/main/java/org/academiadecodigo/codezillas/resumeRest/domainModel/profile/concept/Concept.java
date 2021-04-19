package org.academiadecodigo.codezillas.resumeRest.domainModel.profile.concept;

import org.academiadecodigo.codezillas.resumeRest.domainModel.AbstractModel;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Entity
public class Concept extends AbstractModel {

    private String term;

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    @Override
    public String toString() {
        return "Concept{" +
                "term='" + term + '\'' +
                "} " + super.toString();
    }
}

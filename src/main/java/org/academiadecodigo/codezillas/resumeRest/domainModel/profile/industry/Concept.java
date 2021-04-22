package org.academiadecodigo.codezillas.resumeRest.domainModel.profile.industry;

import org.academiadecodigo.codezillas.resumeRest.domainModel.AbstractModel;

import javax.persistence.Entity;

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

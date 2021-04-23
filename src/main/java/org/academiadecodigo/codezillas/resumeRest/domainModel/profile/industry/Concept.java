package org.academiadecodigo.codezillas.resumeRest.domainModel.profile.industry;

import org.academiadecodigo.codezillas.resumeRest.domainModel.AbstractModel;

import javax.persistence.Entity;

@Entity
public class Concept extends AbstractModel {

    private String conceptName;

    public String getConceptName() {
        return conceptName;
    }

    public void setConceptName(String term) {
        this.conceptName = term;
    }

    @Override
    public String toString() {
        return "Concept{" +
                "term='" + conceptName + '\'' +
                "} " + super.toString();
    }
}

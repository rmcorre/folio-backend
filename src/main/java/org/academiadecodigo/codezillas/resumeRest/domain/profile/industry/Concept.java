package org.academiadecodigo.codezillas.resumeRest.domain.profile.industry;

import org.academiadecodigo.codezillas.resumeRest.domain.AbstractModel;

import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class Concept extends AbstractModel {

    private String concept;

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Concept)) return false;
        Concept concept1 = (Concept) o;
        return getConcept().equals(concept1.getConcept());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getConcept());
    }

    @Override
    public String toString() {
        return "Concept{" +
                "concept='" + concept + '\'' +
                "} " + super.toString();
    }
}

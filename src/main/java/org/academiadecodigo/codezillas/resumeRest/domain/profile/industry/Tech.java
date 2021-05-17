package org.academiadecodigo.codezillas.resumeRest.domain.profile.industry;

import org.academiadecodigo.codezillas.resumeRest.domain.AbstractModel;

import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class Tech extends AbstractModel {

    private String tech;

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tech)) return false;
        Tech tech1 = (Tech) o;
        return getTech().equals(tech1.getTech());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTech());
    }

    @Override
    public String toString() {
        return "Tech{" +
                "tech='" + tech + '\'' +
                "} " + super.toString();
    }
}

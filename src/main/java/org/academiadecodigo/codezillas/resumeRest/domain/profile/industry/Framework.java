package org.academiadecodigo.codezillas.resumeRest.domain.profile.industry;

import org.academiadecodigo.codezillas.resumeRest.domain.AbstractModel;

import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class Framework extends AbstractModel {

    private String framework;

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Framework)) return false;
        Framework framework1 = (Framework) o;
        return getFramework().equals(framework1.getFramework());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFramework());
    }

    @Override
    public String toString() {
        return "Framework{" +
                "framework='" + framework + '\'' +
                "} " + super.toString();
    }
}

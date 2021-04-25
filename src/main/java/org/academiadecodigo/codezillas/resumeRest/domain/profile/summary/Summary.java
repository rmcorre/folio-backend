package org.academiadecodigo.codezillas.resumeRest.domain.profile.summary;

import org.academiadecodigo.codezillas.resumeRest.domain.AbstractModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class Summary extends AbstractModel {

    @Column(length = 350)
    private String summary;
    private Boolean active;

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Summary summary1 = (Summary) o;
        return Objects.equals(summary, summary1.summary) && Objects.equals(active, summary1.active);
    }

    @Override
    public int hashCode() {
        return Objects.hash(summary, active);
    }

    @Override
    public String toString() {
        return "Summary{" +
                "summary='" + summary + '\'' +
                ", active=" + active +
                "} " + super.toString();
    }
}

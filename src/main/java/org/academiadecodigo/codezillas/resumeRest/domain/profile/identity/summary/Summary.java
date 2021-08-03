package org.academiadecodigo.codezillas.resumeRest.domain.profile.identity.summary;

import org.academiadecodigo.codezillas.resumeRest.domain.AbstractModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class Summary extends AbstractModel {

    @Column(length = 1000)
    private String summary;

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Summary summary1 = (Summary) o;
        return Objects.equals(summary, summary1.summary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(summary);
    }

    @Override
    public String toString() {
        return "Summary{" +
                "summary='" + summary + '\'' +
                "} " + super.toString();
    }
}

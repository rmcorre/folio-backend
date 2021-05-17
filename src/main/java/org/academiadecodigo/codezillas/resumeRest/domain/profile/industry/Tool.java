package org.academiadecodigo.codezillas.resumeRest.domain.profile.industry;

import org.academiadecodigo.codezillas.resumeRest.domain.AbstractModel;

import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class Tool extends AbstractModel {

    private String tool;

    public String getTool() {
        return tool;
    }

    public void setTool(String tool) {
        this.tool = tool;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tool)) return false;
        Tool tool1 = (Tool) o;
        return getTool().equals(tool1.getTool());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTool());
    }

    @Override
    public String toString() {
        return "Tool{" +
                "tool='" + tool + '\'' +
                "} " + super.toString();
    }
}

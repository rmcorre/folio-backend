package org.academiadecodigo.codezillas.resumeRest.domain.profile.industry;

import org.academiadecodigo.codezillas.resumeRest.domain.AbstractModel;

import javax.persistence.Entity;

@Entity
public class Tool extends AbstractModel {

    private String toolName;

    public String getToolName() {
        return toolName;
    }

    public void setToolName(String toolName) {
        this.toolName = toolName;
    }

    @Override
    public String toString() {
        return "Tool{" +
                "toolName='" + toolName + '\'' +
                "} " + super.toString();
    }
}
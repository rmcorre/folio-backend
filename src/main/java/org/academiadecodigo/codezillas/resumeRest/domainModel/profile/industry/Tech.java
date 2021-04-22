package org.academiadecodigo.codezillas.resumeRest.domainModel.profile.industry;

import org.academiadecodigo.codezillas.resumeRest.domainModel.AbstractModel;

import javax.persistence.Entity;

@Entity
public class Tech extends AbstractModel {

    private String techName;

    public String getTechName() {
        return techName;
    }

    public void setTechName(String techName) {
        this.techName = techName;
    }

    @Override
    public String toString() {
        return "Tech{" +
                "techName='" + techName + '\'' +
                "} " + super.toString();
    }
}

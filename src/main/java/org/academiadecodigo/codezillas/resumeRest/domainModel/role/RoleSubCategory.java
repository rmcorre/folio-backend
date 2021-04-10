package org.academiadecodigo.codezillas.resumeRest.domainModel.role;

import org.academiadecodigo.codezillas.resumeRest.domainModel.AbstractModel;

import javax.persistence.Entity;

@Entity
public class RoleSubCategory extends AbstractModel {

    private String name;

    public RoleSubCategory() {
    }

    public RoleSubCategory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "RoleSubCategory{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}

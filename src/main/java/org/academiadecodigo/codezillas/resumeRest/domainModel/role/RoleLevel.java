package org.academiadecodigo.codezillas.resumeRest.domainModel.role;

import org.academiadecodigo.codezillas.resumeRest.domainModel.AbstractModel;

import javax.persistence.Entity;

@Entity
public class RoleLevel extends AbstractModel {

    private String name;

    public RoleLevel() {
    }

    public RoleLevel(String name) {
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
        return "RoleLevel{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}

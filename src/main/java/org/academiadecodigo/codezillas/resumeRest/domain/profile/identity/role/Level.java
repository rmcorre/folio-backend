package org.academiadecodigo.codezillas.resumeRest.domain.profile.identity.role;

import org.academiadecodigo.codezillas.resumeRest.domain.AbstractModel;

import javax.persistence.Entity;

@Entity
public class Level extends AbstractModel {

    private String levelName;

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    @Override
    public String toString() {
        return "Level{" +
                "levelName='" + levelName + '\'' +
                "} " + super.toString();
    }
}

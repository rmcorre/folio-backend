package org.academiadecodigo.codezillas.resumeRest.domainModel.level;

import org.academiadecodigo.codezillas.resumeRest.domainModel.AbstractModel;
import org.academiadecodigo.codezillas.resumeRest.domainModel.profile.Profile;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Entity
public class Level extends AbstractModel {

    private String label;

    @ManyToOne(fetch = FetchType.LAZY)
    private Profile profile;

    public Level() {
    }

    public Level(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        return "Level{" +
                "label='" + label + '\'' +
                "} " + super.toString();
    }
}

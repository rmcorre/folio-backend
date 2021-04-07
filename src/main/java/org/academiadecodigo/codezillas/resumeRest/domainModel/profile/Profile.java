package org.academiadecodigo.codezillas.resumeRest.domainModel.profile;

import org.academiadecodigo.codezillas.resumeRest.domainModel.AbstractModel;
import org.academiadecodigo.codezillas.resumeRest.domainModel.identity.Identity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Entity
public class Profile extends AbstractModel {

    @ManyToOne(
            optional = false,
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL
    )
    Identity identity;

    public Identity getIdentity() {
        return identity;
    }

    public void setIdentity(Identity identity) {
        this.identity = identity;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "identity=" + identity +
                "} " + super.toString();
    }
}

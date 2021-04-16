package org.academiadecodigo.codezillas.resumeRest.domainModel.profile.identity.name;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.academiadecodigo.codezillas.resumeRest.domainModel.AbstractModel;
import org.academiadecodigo.codezillas.resumeRest.domainModel.profile.identity.Identity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Name extends AbstractModel {

    private String first;
    private String last;

    @JsonIgnore
    @OneToMany(mappedBy = "name")
    private Set<Identity> identities = new HashSet<>();

    public Name() {
    }

    public Name(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public Set<Identity> getIdentities() {
        return identities;
    }

    public void setIdentities(Set<Identity> identity) {
        this.identities = identity;
    }

    public void addIdentity(Identity identity) {
        identity.setName(this);
        this.identities.add(identity);
    }

    @Override
    public String toString() {
        return "Name{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", identities=" + identities +
                "} " + super.toString();
    }
}

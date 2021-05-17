package org.academiadecodigo.codezillas.resumeRest.domain.profile.framework;

import org.academiadecodigo.codezillas.resumeRest.domain.AbstractModel;
import org.academiadecodigo.codezillas.resumeRest.domain.profile.Profile;
import org.hibernate.annotations.NaturalId;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Framework extends AbstractModel implements Comparable<Framework> {

    @NaturalId
    private String name;

    @ManyToMany(mappedBy = "frameworks")
    private Set<Profile> profileSet = new HashSet<>();

    @Override
    public int compareTo(Framework o) {
        return Integer.compare(super.getId(), o.getId());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Profile> getProfileSet() {
        return profileSet;
    }

    public void setProfileSet(Set<Profile> profileSet) {
        this.profileSet = profileSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Framework)) return false;
        Framework that = (Framework) o;
        return getName().equals(that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "Framework{" +
                "name='" + name + '\'' +
                ", profileSet=" + profileSet +
                "} " + super.toString();
    }
}

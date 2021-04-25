package org.academiadecodigo.codezillas.resumeRest.domain.profile.frameworkOrLibrary;

import org.academiadecodigo.codezillas.resumeRest.domain.AbstractModel;
import org.academiadecodigo.codezillas.resumeRest.domain.profile.Profile;
import org.hibernate.annotations.NaturalId;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class FrameworkOrLibrary extends AbstractModel implements Comparable<FrameworkOrLibrary> {

    @NaturalId
    private String name;

    @ManyToMany(mappedBy = "frameworkOrLibrarySortedSet")
    private Set<Profile> profileSet = new HashSet<>();


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
    public int compareTo(FrameworkOrLibrary o) {
        return Integer.compare(super.getId(), o.getId());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FrameworkOrLibrary)) return false;
        FrameworkOrLibrary that = (FrameworkOrLibrary) o;
        return getName().equals(that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "FrameworkOrLibrary{" +
                "name='" + name + '\'' +
                ", profileSet=" + profileSet +
                "} " + super.toString();
    }
}

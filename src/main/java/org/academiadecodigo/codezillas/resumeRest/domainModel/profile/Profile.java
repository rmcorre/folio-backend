package org.academiadecodigo.codezillas.resumeRest.domainModel.profile;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.academiadecodigo.codezillas.resumeRest.domainModel.AbstractModel;
import org.academiadecodigo.codezillas.resumeRest.domainModel.profile.frameworkOrLibrary.FrameworkOrLibrary;
import org.academiadecodigo.codezillas.resumeRest.domainModel.profile.identity.Identity;
import org.academiadecodigo.codezillas.resumeRest.domainModel.profile.industry.Industry;
import org.academiadecodigo.codezillas.resumeRest.domainModel.profile.role.Role;
import org.academiadecodigo.codezillas.resumeRest.domainModel.profile.summary.Summary;
import org.hibernate.annotations.SortNatural;

import javax.persistence.*;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.UUIDGenerator.class)
public class Profile extends AbstractModel {

    @ManyToOne(
            optional = false,
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL
    )
    private Identity identity;

    @ManyToOne(
            optional = false,
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL
    )
    private Role role;

    @ManyToOne(
            optional = false,
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL
    )
    private Summary summary;

    @ManyToOne(
            optional = false,
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL
    )
    private Industry industry;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "profile_frameworkOrLibrary",
            joinColumns = @JoinColumn(name = "profile_id"),
            inverseJoinColumns = @JoinColumn(name = "frameworkOrLibrary_id")
    )
    @SortNatural
    private final SortedSet<FrameworkOrLibrary> frameworkOrLibrarySortedSet = new TreeSet<>();

    public Identity getIdentity() {
        return identity;
    }

    public void setIdentity(Identity identity) {
        this.identity = identity;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    public Industry getIndustry() {
        return industry;
    }

    public void setIndustry(Industry industry) {
        this.industry = industry;
    }

    public SortedSet<FrameworkOrLibrary> getFrameworkOrLibrarySortedSet() {
        return frameworkOrLibrarySortedSet;
    }

    public void addFrameworkOrLibrary(FrameworkOrLibrary frameworkOrLibrary) {
        frameworkOrLibrarySortedSet.add(frameworkOrLibrary);
        frameworkOrLibrary.getProfileSet().add(this);
    }

    public void removeFrameworkOrLibrary(FrameworkOrLibrary frameworkOrLibrary) {
        frameworkOrLibrarySortedSet.remove(frameworkOrLibrary);
        frameworkOrLibrary.getProfileSet().remove(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Profile)) return false;
        Profile profile = (Profile) o;
        return getIdentity().equals(profile.getIdentity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdentity());
    }

    @Override
    public String toString() {
        return "Profile{" +
                "identity=" + identity +
                ", role=" + role +
                ", summary=" + summary +
                ", industry=" + industry +
                "} " + super.toString();
    }
}

package org.academiadecodigo.codezillas.resumeRest.domain.profile;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.academiadecodigo.codezillas.resumeRest.domain.AbstractModel;
import org.academiadecodigo.codezillas.resumeRest.domain.profile.education.Education;
import org.academiadecodigo.codezillas.resumeRest.domain.profile.identity.Identity;
import org.academiadecodigo.codezillas.resumeRest.domain.profile.industry.Industry;
import org.academiadecodigo.codezillas.resumeRest.domain.profile.workExperience.WorkExperience;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.UUIDGenerator.class)
public class Profile extends AbstractModel {

    @ManyToOne(
        optional = false,
        fetch = FetchType.LAZY,
        cascade = CascadeType.ALL
    )
    private Identity identity;

    @ManyToMany(
        cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
        }
    )
    @JoinTable(
        name = "profile_education",
        joinColumns = @JoinColumn(name = "profile_id"),
        inverseJoinColumns = @JoinColumn(name = "education_id")
    )
    @OrderBy("endDate DESC")
    private final Set<Education> educations = new HashSet<>();

    @ManyToMany(
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            }
    )
    @JoinTable(
            name = "profile_workExperience",
            joinColumns = @JoinColumn(name = "profile_id"),
            inverseJoinColumns = @JoinColumn(name = "workExperience_id")
    )
    @OrderBy("startDate DESC")
    private final Set<WorkExperience> experiences = new HashSet<>();

    @ManyToOne(
        optional = false,
        fetch = FetchType.LAZY,
        cascade = CascadeType.ALL
    )
    private Industry industry;

    public Identity getIdentity() {
        return identity;
    }

    public void setIdentity(Identity identity) {
        this.identity = identity;
    }

    public Set<Education> getEducations() {
        return educations;
    }

    public Set<WorkExperience> getExperiences() {
        return experiences;
    }

    public Industry getIndustry() {
        return industry;
    }

    public void setIndustry(Industry industry) {
        this.industry = industry;
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
                ", educations=" + educations +
                ", experiences=" + experiences +
                ", industry=" + industry +
                "} " + super.toString();
    }
}

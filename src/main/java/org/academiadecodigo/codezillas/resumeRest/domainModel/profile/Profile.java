package org.academiadecodigo.codezillas.resumeRest.domainModel.profile;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.academiadecodigo.codezillas.resumeRest.domainModel.AbstractModel;
import org.academiadecodigo.codezillas.resumeRest.domainModel.profile.identity.Identity;
import org.academiadecodigo.codezillas.resumeRest.domainModel.profile.industry.Industry;
import org.academiadecodigo.codezillas.resumeRest.domainModel.profile.role.Role;
import org.academiadecodigo.codezillas.resumeRest.domainModel.profile.summary.Summary;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

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

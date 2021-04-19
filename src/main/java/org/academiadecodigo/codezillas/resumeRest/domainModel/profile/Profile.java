package org.academiadecodigo.codezillas.resumeRest.domainModel.profile;

import org.academiadecodigo.codezillas.resumeRest.domainModel.AbstractModel;
import org.academiadecodigo.codezillas.resumeRest.domainModel.profile.concept.ConceptGroup;
import org.academiadecodigo.codezillas.resumeRest.domainModel.profile.identity.Identity;
import org.academiadecodigo.codezillas.resumeRest.domainModel.profile.role.Role;
import org.academiadecodigo.codezillas.resumeRest.domainModel.profile.summary.Summary;
import org.academiadecodigo.codezillas.resumeRest.domainModel.profile.tool.ToolGroup;

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
    private ConceptGroup conceptGroup;

    @ManyToOne(
            optional = false,
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL
    )
    private ToolGroup toolGroup;

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

    public ConceptGroup getConceptGroup() {
        return conceptGroup;
    }

    public void setConceptGroup(ConceptGroup conceptGroup) {
        this.conceptGroup = conceptGroup;
    }

    public ToolGroup getToolGroup() {
        return toolGroup;
    }

    public void setToolGroup(ToolGroup toolGroup) {
        this.toolGroup = toolGroup;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "identity=" + identity +
                ", role=" + role +
                ", summary=" + summary +
                ", conceptGroup=" + conceptGroup +
                ", toolGroup=" + toolGroup +
                "} " + super.toString();
    }
}

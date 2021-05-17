package org.academiadecodigo.codezillas.resumeRest.domain.profile.identity;

import org.academiadecodigo.codezillas.resumeRest.domain.AbstractModel;
import org.academiadecodigo.codezillas.resumeRest.domain.profile.identity.contact.Contact;
import org.academiadecodigo.codezillas.resumeRest.domain.profile.identity.name.Name;
import org.academiadecodigo.codezillas.resumeRest.domain.profile.identity.summary.Summary;

import javax.persistence.*;

@Entity
public class Identity extends AbstractModel {

    @ManyToOne(
            optional = false,
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL
    )
    private Name name;

    @ManyToOne(
            optional = false,
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL
    )
    private Contact contact;

    @ManyToOne(
            optional = false,
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL
    )
    private Summary summary;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    @Override
    public String toString() {
        return "Identity{" +
                "name=" + name +
                ", contact=" + contact +
                ", summary=" + summary +
                "} " + super.toString();
    }
}

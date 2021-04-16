package org.academiadecodigo.codezillas.resumeRest.domainModel.profile.identity;

import org.academiadecodigo.codezillas.resumeRest.domainModel.AbstractModel;
import org.academiadecodigo.codezillas.resumeRest.domainModel.profile.identity.contact.Contact;
import org.academiadecodigo.codezillas.resumeRest.domainModel.profile.identity.name.Name;

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

    @Override
    public String toString() {
        return "Identity{" +
                "name=" + name +
                ", contact=" + contact +
                "} " + super.toString();
    }
}

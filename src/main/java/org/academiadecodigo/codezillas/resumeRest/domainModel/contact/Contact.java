package org.academiadecodigo.codezillas.resumeRest.domainModel.contact;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.academiadecodigo.codezillas.resumeRest.domainModel.AbstractModel;
import org.academiadecodigo.codezillas.resumeRest.domainModel.identity.Identity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Contact extends AbstractModel {

    @ManyToOne(
            optional = false,
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL
    )
    private Email email;

    @ManyToOne(
            optional = false,
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL
    )
    private Phone phone;

    @ManyToOne(
            optional = false,
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL
    )
    private Address address;

    @JsonIgnore
    @OneToMany(mappedBy = "contact")
    private Set<Identity> identities = new HashSet<>();

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Set<Identity> getIdentities() {
        return identities;
    }

    public void setIdentities(Set<Identity> identities) {
        this.identities = identities;
    }

    public void addIdentity(Identity identity) {
        identity.setContact(this);
        this.identities.add(identity);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "email=" + email +
                ", phone=" + phone +
                ", address=" + address +
                ", identities=" + identities +
                "} " + super.toString();
    }
}

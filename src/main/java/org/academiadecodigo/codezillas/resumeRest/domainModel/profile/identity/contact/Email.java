package org.academiadecodigo.codezillas.resumeRest.domainModel.profile.identity.contact;

import org.academiadecodigo.codezillas.resumeRest.domainModel.AbstractModel;

import javax.persistence.Entity;

@Entity
public class Email extends AbstractModel {

    private String email;

    public Email() {
    }

    public Email(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Email{" +
                "email='" + email + '\'' +
                "} " + super.toString();
    }
}

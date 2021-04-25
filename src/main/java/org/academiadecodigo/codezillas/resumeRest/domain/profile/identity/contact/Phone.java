package org.academiadecodigo.codezillas.resumeRest.domain.profile.identity.contact;

import org.academiadecodigo.codezillas.resumeRest.domain.AbstractModel;

import javax.persistence.Entity;

@Entity
public class Phone extends AbstractModel {

    private String countryCode;
    private String number;

    public Phone() {
    }

    public Phone(String countryCode, String number) {
        this.countryCode = countryCode;
        this.number = number;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "countryCode='" + countryCode + '\'' +
                ", number='" + number + '\'' +
                "} " + super.toString();
    }
}

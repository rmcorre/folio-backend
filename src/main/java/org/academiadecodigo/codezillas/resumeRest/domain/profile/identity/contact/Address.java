package org.academiadecodigo.codezillas.resumeRest.domain.profile.identity.contact;

import org.academiadecodigo.codezillas.resumeRest.domain.AbstractModel;

import javax.persistence.Entity;

@Entity
public class Address extends AbstractModel {

    private String num;
    private String address;
    private String parish;
    private String town;
    private String city;
    private String county;
    private String stateProvince;
    private String island;
    private String region;
    private String country;
    private String postalCode;

    public Address() {
    }

    public Address(String num, String address, String parish, String town, String city, String county, String stateProvince, String island, String region, String country, String postalCode) {
        this.num = num;
        this.address = address;
        this.parish = parish;
        this.town = town;
        this.city = city;
        this.county = county;
        this.stateProvince = stateProvince;
        this.island = island;
        this.region = region;
        this.country = country;
        this.postalCode = postalCode;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getParish() {
        return parish;
    }

    public void setParish(String parish) {
        this.parish = parish;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public String getIsland() {
        return island;
    }

    public void setIsland(String island) {
        this.island = island;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "num='" + num + '\'' +
                ", address='" + address + '\'' +
                ", parish='" + parish + '\'' +
                ", town='" + town + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", stateProvince='" + stateProvince + '\'' +
                ", island='" + island + '\'' +
                ", region='" + region + '\'' +
                ", country='" + country + '\'' +
                ", postalCode='" + postalCode + '\'' +
                "} " + super.toString();
    }
}

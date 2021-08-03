package org.academiadecodigo.codezillas.resumeRest.domain.profile.workExperience;

import org.academiadecodigo.codezillas.resumeRest.domain.AbstractModel;
import org.academiadecodigo.codezillas.resumeRest.domain.profile.Profile;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class WorkExperience extends AbstractModel {

    private String organization;
    private String location;
    private String startDate;
    private String endDate;
    private String jobRole;
    @Column(length=1000)
    private String summary;
    private String duties;

    @ManyToMany(mappedBy = "experiences")
    private final Set<Profile> profileSet = new HashSet<>();

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDuties() {
        return duties;
    }

    public void setDuties(String duties) {
        this.duties = duties;
    }

    public Set<Profile> getProfileSet() {
        return profileSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WorkExperience)) return false;
        WorkExperience that = (WorkExperience) o;
        return getOrganization().equals(that.getOrganization()) && getJobRole().equals(that.getJobRole());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOrganization(), getJobRole());
    }

    @Override
    public String toString() {
        return "WorkExperience{" +
                "organization='" + organization + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", jobRole='" + jobRole + '\'' +
                ", summary='" + summary + '\'' +
                ", duties='" + duties + '\'' +
                ", profileSet=" + profileSet +
                "} " + super.toString();
    }
}

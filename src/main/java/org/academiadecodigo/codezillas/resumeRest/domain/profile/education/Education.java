package org.academiadecodigo.codezillas.resumeRest.domain.profile.education;

import org.academiadecodigo.codezillas.resumeRest.domain.AbstractModel;
import org.academiadecodigo.codezillas.resumeRest.domain.profile.Profile;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Education extends AbstractModel {

    private String institution;
    private String course;
    private String startDate;
    private String endDate;

    @Embedded
    private EducationAddress educationAddress;

    @ManyToMany(mappedBy = "educations")
    private Set<Profile> profileSet = new HashSet<>();

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
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

    public EducationAddress getEducationAddress() {
        return educationAddress;
    }

    public void setEducationAddress(EducationAddress educationAddress) {
        this.educationAddress = educationAddress;
    }

    public Set<Profile> getProfileSet() {
        return profileSet;
    }

    public void setProfileSet(Set<Profile> profileSet) {
        this.profileSet = profileSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Education)) return false;
        Education education = (Education) o;
        return getInstitution().equals(education.getInstitution());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getInstitution());
    }

    @Override
    public String toString() {
        return "Education{" +
                "institution='" + institution + '\'' +
                ", course='" + course + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", educationAddress=" + educationAddress +
                ", profileSet=" + profileSet +
                "} " + super.toString();
    }
}



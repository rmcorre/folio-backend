package org.academiadecodigo.codezillas.resumeRest.domain.profile.education;

import org.academiadecodigo.codezillas.resumeRest.domain.AbstractModel;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class EducationGroup extends AbstractModel {

    private String groupName;

    @Transient
    private Integer[] educations = null;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(
        name = "educationgroup_education",
        joinColumns = @JoinColumn(name = "educationgroup_id"),
        inverseJoinColumns = @JoinColumn(name = "education_id"))
    private final Set<Education> educationSet = new HashSet<>();

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Integer[] getEducations() {
        return educations;
    }

    public void setEducations(Integer[] educations) {
        this.educations = educations;
    }

    public Set<Education> getEducationSet() {
        return educationSet;
    }


    //    public void addPortfolio(Portfolio portfolio) {
//        this.portfolioList.add(portfolio);
//    }
//
//    public void removePortfolio(Portfolio portfolio) {
//        this.portfolioList.remove(portfolio);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EducationGroup that = (EducationGroup) o;
        return Objects.equals(groupName, that.groupName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupName);
    }

    @Override
    public String toString() {
        return "EducationGroup{" +
                "groupName='" + groupName + '\'' +
                "} " + super.toString();
    }
}

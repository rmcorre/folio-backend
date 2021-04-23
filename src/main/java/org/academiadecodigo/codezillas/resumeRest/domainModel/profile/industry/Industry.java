package org.academiadecodigo.codezillas.resumeRest.domainModel.profile.industry;

import org.academiadecodigo.codezillas.resumeRest.domainModel.AbstractModel;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Industry extends AbstractModel {

    private String name;

    @OneToMany(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "industry_id")
    List<Concept> conceptList = new ArrayList<>();

    @OneToMany(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "industry_id")
    List<Tech> techList = new ArrayList<>();

    @OneToMany(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "industry_id")
    List<Tool> toolList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Concept> getConceptList() {
        return conceptList;
    }

    public void setConceptList(List<Concept> conceptList) {
        this.conceptList = conceptList;
    }

    public List<Tech> getTechList() {
        return techList;
    }

    public void setTechList(List<Tech> techList) {
        this.techList = techList;
    }

    public List<Tool> getToolList() {
        return toolList;
    }

    public void setToolList(List<Tool> toolList) {
        this.toolList = toolList;
    }

    @Override
    public String toString() {
        return "Industry{" +
                "name='" + name + '\'' +
                ", conceptList=" + conceptList +
                ", techList=" + techList +
                ", toolList=" + toolList +
                "} " + super.toString();
    }
}

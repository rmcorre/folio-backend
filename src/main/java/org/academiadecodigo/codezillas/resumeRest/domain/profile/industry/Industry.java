package org.academiadecodigo.codezillas.resumeRest.domain.profile.industry;

import org.academiadecodigo.codezillas.resumeRest.domain.AbstractModel;

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
    List<Concept> concepts = new ArrayList<>();

    @OneToMany(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "industry_id")
    List<Tech> techs = new ArrayList<>();

    @OneToMany(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "industry_id")
    List<Framework> frameworks = new ArrayList<>();

    @OneToMany(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "industry_id")
    List<Tool> tools = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Concept> getConcepts() {
        return concepts;
    }

    public void setConcepts(List<Concept> conceptList) {
        this.concepts = conceptList;
    }

    public List<Tech> getTechs() {
        return techs;
    }

    public void setTechs(List<Tech> techList) {
        this.techs = techList;
    }

    public List<Framework> getFrameworks() {
        return frameworks;
    }

    public void setFrameworks(List<Framework> frameworks) {
        this.frameworks = frameworks;
    }

    public List<Tool> getTools() {
        return tools;
    }

    public void setTools(List<Tool> toolList) {
        this.tools = toolList;
    }

    @Override
    public String toString() {
        return "Industry{" +
                "name='" + name + '\'' +
                ", conceptList=" + concepts +
                ", techList=" + techs +
                ", toolList=" + tools +
                "} " + super.toString();
    }
}

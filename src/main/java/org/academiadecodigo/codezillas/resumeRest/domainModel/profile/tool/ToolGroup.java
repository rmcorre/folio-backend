package org.academiadecodigo.codezillas.resumeRest.domainModel.profile.tool;

import org.academiadecodigo.codezillas.resumeRest.domainModel.AbstractModel;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ToolGroup extends AbstractModel {

    private String toolGroupName;

    @OneToMany (
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "tool_group_id")
    private List<Tool> tools = new ArrayList<>();

    public String getToolGroupName() {
        return toolGroupName;
    }

    public void setToolGroupName(String toolGroupName) {
        this.toolGroupName = toolGroupName;
    }

    public List<Tool> getTools() {
        return tools;
    }

    public void setTools(List<Tool> tools) {
        this.tools = tools;
    }

    @Override
    public String toString() {
        return "ToolGroup{" +
                "toolGroupName='" + toolGroupName + '\'' +
                ", tools=" + tools +
                "} " + super.toString();
    }
}

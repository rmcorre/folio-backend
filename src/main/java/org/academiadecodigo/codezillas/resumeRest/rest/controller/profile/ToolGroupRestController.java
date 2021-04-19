package org.academiadecodigo.codezillas.resumeRest.rest.controller.profile;

import org.academiadecodigo.codezillas.resumeRest.domainModel.profile.tool.ToolGroup;
import org.academiadecodigo.codezillas.resumeRest.service.profile.toolGroup.ToolGroupSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class ToolGroupRestController {

    private ToolGroupSvc toolGroupSvc;

    @Autowired
    public ToolGroupRestController(ToolGroupSvc toolGroupSvc) {
        this.toolGroupSvc = toolGroupSvc;
    }

    @GetMapping("/toolGroups")
    public List<ToolGroup> getToolGroups() {
        return toolGroupSvc.getToolGroups();
    }

    @GetMapping("/toolGroups/{id}")
    public ToolGroup getToolGroup(@PathVariable Integer id) {
        return toolGroupSvc.getToolGroup(id);
    }

    public ToolGroupSvc getToolGroupSvc() {
        return toolGroupSvc;
    }

    public void setToolGroupSvc(ToolGroupSvc toolGroupSvc) {
        this.toolGroupSvc = toolGroupSvc;
    }

    @Override
    public String toString() {
        return "ToolGroupRestController{" +
                "toolGroupSvc=" + toolGroupSvc +
                '}';
    }
}

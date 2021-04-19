package org.academiadecodigo.codezillas.resumeRest.service.profile.toolGroup;

import org.academiadecodigo.codezillas.resumeRest.domainModel.profile.tool.ToolGroup;

import java.util.List;

public interface ToolGroupSvc {

    List<ToolGroup> getToolGroups();

    ToolGroup getToolGroup(Integer id);
 }

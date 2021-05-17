package org.academiadecodigo.codezillas.resumeRest.service.profile.framework;

import org.academiadecodigo.codezillas.resumeRest.domain.profile.industry.Framework;

import java.util.Set;

public interface FrameworkSvc {

    Set<Framework> getFrameworksOrLibraries();

    Framework getFrameworkOrLibrary(Integer id);
}

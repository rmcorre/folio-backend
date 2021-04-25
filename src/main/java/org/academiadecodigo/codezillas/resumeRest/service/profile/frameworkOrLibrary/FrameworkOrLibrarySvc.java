package org.academiadecodigo.codezillas.resumeRest.service.profile.frameworkOrLibrary;

import org.academiadecodigo.codezillas.resumeRest.domainModel.profile.frameworkOrLibrary.FrameworkOrLibrary;

import java.util.Set;

public interface FrameworkOrLibrarySvc {

    Set<FrameworkOrLibrary> getFrameworksOrLibraries();

    FrameworkOrLibrary getFrameworkOrLibrary(Integer id);
}

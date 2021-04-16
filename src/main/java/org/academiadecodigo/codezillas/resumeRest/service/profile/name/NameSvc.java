package org.academiadecodigo.codezillas.resumeRest.service.profile.name;

import org.academiadecodigo.codezillas.resumeRest.domainModel.profile.identity.name.Name;

import java.util.Set;

public interface NameSvc {

    Set<Name> getNames();

    Name getName(Integer id);
}

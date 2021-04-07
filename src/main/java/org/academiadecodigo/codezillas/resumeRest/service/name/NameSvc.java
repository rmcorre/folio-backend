package org.academiadecodigo.codezillas.resumeRest.service.name;

import org.academiadecodigo.codezillas.resumeRest.domainModel.name.Name;

import java.util.Set;

public interface NameSvc {

    Set<Name> getNames();

    Name getName(Integer id);
}

package org.academiadecodigo.codezillas.resumeRest.service.role;

import org.academiadecodigo.codezillas.resumeRest.domainModel.role.Role;

import java.util.Set;

public interface RoleSvc {

    Set<Role> getRoles();

    Role getRole(Integer id);
}

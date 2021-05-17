package org.academiadecodigo.codezillas.resumeRest.service.profile.role;

import org.academiadecodigo.codezillas.resumeRest.domain.profile.identity.role.Role;

import java.util.Set;

public interface RoleSvc {

    Set<Role> getRoles();

    Role getRole(Integer id);
}

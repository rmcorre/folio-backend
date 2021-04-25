package org.academiadecodigo.codezillas.resumeRest.rest.controller.profile;

import org.academiadecodigo.codezillas.resumeRest.domain.profile.role.Role;
import org.academiadecodigo.codezillas.resumeRest.service.profile.role.RoleSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/")
public class RoleRestController {

    private final RoleSvc roleSvc;

    @Autowired
    public RoleRestController(RoleSvc roleSvc) {
        this.roleSvc = roleSvc;
    }

    @GetMapping("/roles")
    public Set<Role> getRoles() {
        return roleSvc.getRoles();
    }
}

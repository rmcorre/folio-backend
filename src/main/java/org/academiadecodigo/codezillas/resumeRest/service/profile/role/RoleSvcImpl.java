package org.academiadecodigo.codezillas.resumeRest.service.profile.role;

import org.academiadecodigo.codezillas.resumeRest.domain.profile.role.Role;
import org.academiadecodigo.codezillas.resumeRest.repository.profile.RoleJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Transactional
public class RoleSvcImpl implements RoleSvc{

    private final RoleJpaRepository roleJpaRepository;

    @Autowired
    public RoleSvcImpl(RoleJpaRepository roleJpaRepository) {
        this.roleJpaRepository = roleJpaRepository;
    }

    @Override
    public Set<Role> getRoles() {
        return new HashSet<>(roleJpaRepository.findAll());
    }

    @Override
    public Role getRole(Integer id) {

        Optional<Role> result = roleJpaRepository.findById(id);

        Role role = null;
        if (result.isPresent()) {
            role = result.get();
        }

        return role;
    }
}

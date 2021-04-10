package org.academiadecodigo.codezillas.resumeRest.service.identity;

import org.academiadecodigo.codezillas.resumeRest.repository.IdentityJpaRepository;
import org.academiadecodigo.codezillas.resumeRest.domainModel.identity.Identity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Transactional
public class IdentitySvcImpl implements IdentitySvc {

    private final IdentityJpaRepository identityJpaRepository;

    @Autowired
    public IdentitySvcImpl(IdentityJpaRepository identityJpaRepository) {
        this.identityJpaRepository = identityJpaRepository;
    }

    @Override
    public Set<Identity> getIdentities() {
        return new HashSet<>(identityJpaRepository.findAll());
    }

    @Override
    public Identity getIdentity(int id) {

        Optional<Identity> result = identityJpaRepository.findById(id);

        Identity identity = null;
        if (result.isPresent()) {
            identity = result.get();
        }

        return identity;
    }

    @Override
    @Transactional
    public Identity save(Identity identity) {
        return identityJpaRepository.save(identity);
    }

    @Override
    public Identity saveOrUpdate(Identity identity) {
        return identityJpaRepository.save(identity);
    }
}

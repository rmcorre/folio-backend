package org.academiadecodigo.codezillas.resumeRest.service.identity;

import org.academiadecodigo.codezillas.resumeRest.domainModel.identity.Identity;

import java.util.Set;

public interface IdentitySvc {

    Set<Identity> getIdentities();

    Identity getIdentity(int id);

    Identity save(Identity identity);

    Identity saveOrUpdate(Identity identity);
}

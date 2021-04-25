package org.academiadecodigo.codezillas.resumeRest;

import org.academiadecodigo.codezillas.resumeRest.repository.profile.NameJpaRepository;
import org.academiadecodigo.codezillas.resumeRest.domain.profile.identity.Identity;
import org.academiadecodigo.codezillas.resumeRest.domain.profile.identity.name.Name;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
public class NameTest {

    @Autowired
    private NameJpaRepository nameJpaRepository;

    @Test
    void getIdentitiesList() {
        Name name1 = nameJpaRepository.getOne(2);
        Set<Identity> identities = new HashSet(name1.getIdentities());
        assertThat(identities.size()).isEqualTo(1);
    }
}

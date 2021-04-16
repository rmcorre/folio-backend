package org.academiadecodigo.codezillas.resumeRest.jpaRepositoryIntegrationTest;

import org.academiadecodigo.codezillas.resumeRest.repository.profile.IdentityJpaRepository;
import org.academiadecodigo.codezillas.resumeRest.repository.profile.NameJpaRepository;
import org.academiadecodigo.codezillas.resumeRest.domainModel.profile.identity.Identity;
import org.academiadecodigo.codezillas.resumeRest.domainModel.profile.identity.name.Name;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Iterator;
import java.util.Set;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
public class NameJpaRepositoryIntegrationTest {

    @Autowired
    NameJpaRepository nameJpaRepository;

    @Autowired
    IdentityJpaRepository identityJpaRepository;


    @Test
    void whenSaved_assertThatRetrievedIsEqualToSaved() {

        //given
        Name savedName = nameJpaRepository.save(new Name("Alice", "Wonderland"));

        //when
        Name retrievedName = nameJpaRepository.getOne(savedName.getId());

        //assert
        assertThat(retrievedName.getId()).isEqualTo(savedName.getId());
    }


    @Test
    void whenAddIdentity_assertThatRetrievedIdentitiesIsEqualToSavedIdentities() {

        //given
        Name name1 = new Name("Lady","Gaga");
        Identity identity1 = new Identity();
        Identity identity2 = new Identity();
        Identity identity3 = new Identity();

        //when
        name1.addIdentity(identity1);
        name1.addIdentity(identity2);
        name1.addIdentity(identity3);
        Name savedName = nameJpaRepository.save(name1);

        //assert
        Name retrievedName = nameJpaRepository.getOne(savedName.getId());
        assertThat(retrievedName.getIdentities().size()).isEqualTo(savedName.getIdentities().size());
    }

    @Test
    void whenAddIdentity_assertThatIdentityHasName() {

        //given
        Name name1 = new Name("Elton","John");
        Identity identity1 = new Identity();

        //when
        name1.addIdentity(identity1);
        Name savedName = nameJpaRepository.save(name1);

        //assert
        Set<Identity> identities = savedName.getIdentities();
        Iterator<Identity> iterator = identities.iterator();
        Identity retrievedIdentity = iterator.next();
        assertThat(retrievedIdentity.getName().getId()).isEqualTo(savedName.getId());
    }
}

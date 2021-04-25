package org.academiadecodigo.codezillas.resumeRest.jpaRepositoryIntegrationTest;

import org.academiadecodigo.codezillas.resumeRest.repository.profile.IdentityJpaRepository;
import org.academiadecodigo.codezillas.resumeRest.domain.profile.identity.Identity;
import org.academiadecodigo.codezillas.resumeRest.domain.profile.identity.name.Name;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.assertj.core.api.Assertions.*;

@DataJpaTest
public class IdentityJpaRepositoryIntegrationTest {

    @Autowired
    IdentityJpaRepository identityJpaRepository;

    @Test
    void whenSave_assertThatIsNotNull() {
        //given
        Name name1 = new Name("Bob", "Dylan");
        Identity identity = new Identity();
        identity.setName(name1);


        //when
        Identity savedIdentity = identityJpaRepository.save(identity);

        //assert
        assertThat(savedIdentity).isNotNull();
    }

    @Test
    void whenFindByFirstname_assertThatRetrievedIsEqualToSaved() {
        //given

        //when

        //assert

    }
}

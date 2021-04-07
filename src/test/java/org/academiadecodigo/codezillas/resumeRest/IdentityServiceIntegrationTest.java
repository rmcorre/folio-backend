package org.academiadecodigo.codezillas.resumeRest;

import org.academiadecodigo.codezillas.resumeRest.repository.IdentityJpaRepository;
import org.academiadecodigo.codezillas.resumeRest.service.identity.IdentitySvc;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class IdentityServiceIntegrationTest {

    @Autowired
    private IdentityJpaRepository identityJpaRepository;

    @Autowired
    private IdentitySvc identitySvc;

    @Test
    void whenFindByFirstName_thenReturnIdentity() {
        // given

        // when

        // then

    }
}

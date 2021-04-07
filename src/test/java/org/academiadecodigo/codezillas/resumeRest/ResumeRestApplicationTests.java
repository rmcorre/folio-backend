package org.academiadecodigo.codezillas.resumeRest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ResumeRestApplicationTests {

	@Value("${spring.profiles.active}")
	private String springProfilesActive;

	@Test
	void contextLoads() {
		System.out.println("########################## " + springProfilesActive);

	}

}

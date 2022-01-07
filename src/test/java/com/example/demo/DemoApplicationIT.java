package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles({"it", "red", "small"})
class DemoApplicationIT {

	@Autowired DemoApplication demoApplication;

	@Test
	void contextLoads() throws Exception {
		// not needed - runs automatically: demoApplication.run("Test");
	}

}

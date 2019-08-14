package com.prasanna.jenkins.api;


import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringJenkinApplicationTests {
	
	public static Logger logger = LoggerFactory.getLogger(SpringJenkinApplicationTests.class);

	@Test
	public void contextLoads() {
	
		logger.info("Test case executing");
		assertNotEquals(true, true);
	}

}

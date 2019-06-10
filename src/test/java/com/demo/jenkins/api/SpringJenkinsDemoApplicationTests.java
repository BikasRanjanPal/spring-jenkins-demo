package com.demo.jenkins.api;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringJenkinsDemoApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsDemoApplicationTests.class);

	@Test
	public  contextLoads() {
		logger.info("Test Case Executing....");
		logger.info("Test Case Executing 2nd log statement....");
		logger.info("Test Case Executing 3rd log statement....");
		logger.info("Test Case Executing 4th log statement....");
		logger.info("Test Case Executing 5th log statement....");
		assertEquals(true, true);
	}

}

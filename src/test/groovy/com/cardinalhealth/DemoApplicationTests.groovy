package com.cardinalhealth

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.SpringApplicationConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.test.context.web.WebAppConfiguration

import com.cardinalhealth.DemoApplication;

@RunWith(SpringJUnit4ClassRunner)
@SpringApplicationConfiguration(classes = DemoApplication)
@WebAppConfiguration
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

}

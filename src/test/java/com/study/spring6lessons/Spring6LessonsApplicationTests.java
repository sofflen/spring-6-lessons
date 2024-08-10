package com.study.spring6lessons;

import com.study.spring6lessons.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6LessonsApplicationTests {

	@Autowired
	ApplicationContext applicationContext;
	@Autowired
	MyController myController;

	@Test
	void getControllerFromAutowire() {
		System.out.println(myController.sayHello());
	}

	@Test
	void getControllerFromContext() {
		MyController myController = applicationContext.getBean(MyController.class);
		System.out.println(myController.sayHello());
	}

	@Test
	void contextLoads() {
	}

}

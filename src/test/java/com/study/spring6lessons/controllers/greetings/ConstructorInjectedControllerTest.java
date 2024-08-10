package com.study.spring6lessons.controllers.greetings;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConstructorInjectedControllerTest {

    @Autowired
    ConstructorInjectedController controller;
    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}
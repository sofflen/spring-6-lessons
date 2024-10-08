package com.study.spring6lessons.controllers.greetings.i18n;

import com.study.spring6lessons.controllers.greetings.i18n.I18nController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("ES")
@SpringBootTest
class SpanishI18nControllerTest {

    @Autowired
    I18nController i18nController;

    @Test
    void sayHello() {
        System.out.println(i18nController.sayHello());
    }
}
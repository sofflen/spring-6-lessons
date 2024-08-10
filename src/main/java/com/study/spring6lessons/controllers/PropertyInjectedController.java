package com.study.spring6lessons.controllers;

import com.study.spring6lessons.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {


    @Qualifier("propertyInjectedGreetingService")
    @Autowired
    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayHello();
    }
}

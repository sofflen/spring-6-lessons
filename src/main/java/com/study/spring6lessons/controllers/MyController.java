package com.study.spring6lessons.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello() {
        System.out.println("In the controller");

        return "Hello World";
    }
}

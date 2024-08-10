package com.study.spring6lessons;

import com.study.spring6lessons.controllers.MyController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring6LessonsApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Spring6LessonsApplication.class, args);

        MyController controller = ctx.getBean(MyController.class);

        System.out.println("In main method\n" + controller.sayHello());
    }

}

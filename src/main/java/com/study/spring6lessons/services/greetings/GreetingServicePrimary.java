package com.study.spring6lessons.services.greetings;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingServicePrimary implements GreetingService {

    @Override
    public String sayHello() {
        return "Hello World! From Primary Service";
    }
}

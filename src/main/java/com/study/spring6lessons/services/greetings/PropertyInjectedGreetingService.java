package com.study.spring6lessons.services.greetings;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello World! From PropertyInjectedGreetingService";
    }
}

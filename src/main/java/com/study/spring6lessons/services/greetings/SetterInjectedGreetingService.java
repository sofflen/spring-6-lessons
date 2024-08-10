package com.study.spring6lessons.services.greetings;

import org.springframework.stereotype.Service;

@Service("setterGreetingBean")
public class SetterInjectedGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello World! From SetterInjectedGreetingService";
    }
}

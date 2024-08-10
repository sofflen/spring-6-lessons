package com.study.spring6lessons.services.i18n;

import com.study.spring6lessons.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
@Service("i18nGreetingServiceBean")
public class EnglishGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello World! - EN";
    }
}

package com.study.spring6lessons.services.greetings.i18n;

import com.study.spring6lessons.services.greetings.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nGreetingServiceBean")
public class SpanishGreetingService  implements GreetingService {
    @Override
    public String sayHello() {
        return "Hola Mundo! - ES";
    }
}

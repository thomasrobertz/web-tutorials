package service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class HelloServiceEn implements HelloService {
    @Override
    public String say(String message) {
        return "Hello " + message + "!";
    }
}

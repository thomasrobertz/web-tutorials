package service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("en")
public class HelloServiceEn implements HelloService {
    @Override
    public String say(String message) {
        return "Hello " + message + "!";
    }
}

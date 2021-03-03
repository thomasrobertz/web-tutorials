package service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("es")
public class HelloServiceEs implements HelloService {
    @Override
    public String say(String message) {
        return "Hola " + message + "!";
    }
}

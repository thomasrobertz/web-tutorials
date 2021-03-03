package service;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceEs implements HelloService {
    @Override
    public String say(String message) {
        return "Hola " + message + "!";
    }
}

package services;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String sayHelloTo(String name) {
        return "Hello, " + name;
    }
}

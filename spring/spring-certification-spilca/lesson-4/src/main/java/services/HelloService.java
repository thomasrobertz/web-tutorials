package services;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public void sayHelloTo(String name) {
        System.out.println("Hello, " + name);
    }
}

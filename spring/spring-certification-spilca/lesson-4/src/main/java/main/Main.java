package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.HelloService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            HelloService hs = context.getBean(HelloService.class);

            hs.sayHelloTo("Paul");

            Arrays.asList(context.getBeanDefinitionNames()).forEach(b ->
                    System.out.printf("Bean: %s\n", b)
            );
        }
    }
}

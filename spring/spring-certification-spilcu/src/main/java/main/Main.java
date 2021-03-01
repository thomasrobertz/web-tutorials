package main;

import config.ProjectConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.ProductDeliveryService;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
    }

    public Main() {
        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(ProjectConfiguration.class)) {

            ProductDeliveryService service = context.getBean(ProductDeliveryService.class);
            service.addProduct();

            System.out.println("Registered beans: ");
            Arrays.asList(context.getBeanDefinitionNames()).forEach(b ->
                    System.out.printf("Bean: %s\n", b)
            );
        }
    }
}

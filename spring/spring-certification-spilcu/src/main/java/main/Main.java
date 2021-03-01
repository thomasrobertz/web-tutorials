package main;

import beans.MyBean;
import config.ProjectConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {

    MyBean myBean;

    public static void main(String[] args) {
        Main main = new Main();
    }

    public Main() {
        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(ProjectConfiguration.class)) {

            // Get a MyBean instance from the context
            myBean = context.getBean(MyBean.class);

            System.out.println(myBean.getText());

            System.out.println(myBean);

            System.out.println("Registered beans: ");
            Arrays.asList(context.getBeanDefinitionNames()).forEach(b ->
                    System.out.println(b)
            );
        }
    }
}

package main;

import beans.MyBean;
import config.ProjectConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(ProjectConfiguration.class)) {

            // Get a MyBean instance from the context
            MyBean myBean = context.getBean(MyBean.class);

        }
    }
}

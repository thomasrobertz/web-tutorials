package main;

import beans.MyBean;
import config.ProjectConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
        }
    }
}

package main;

import beans.Owner;
import config.ProjectConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
    }

    public Main() {
        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(ProjectConfiguration.class)) {

            Owner owner = context.getBean(Owner.class);

            System.out.println(owner);
        }
    }
}

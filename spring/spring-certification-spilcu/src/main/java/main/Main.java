package main;

import beans.Cat;
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

            Cat cat = context.getBean("kitty", Cat.class);
            Owner owner = context.getBean(Owner.class);

            cat.setName("Leo");
            System.out.println(cat);
            System.out.println(owner);
        }
    }
}

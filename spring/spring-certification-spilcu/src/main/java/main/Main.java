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
            myBean = context.getBean("myBean", MyBean.class);
            MyBean myBean2 = context.getBean("myBean2", MyBean.class);
            MyBean myBean3 = context.getBean("myBean", MyBean.class);

            System.out.println(myBean.getText());

            System.out.println(myBean);
            System.out.println(myBean2); // MyBean two is a different bean with a different hash id.
            System.out.println(myBean3);
        }
    }
}

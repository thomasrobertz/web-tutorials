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
            MyBean myBean2 = context.getBean(MyBean.class);
            MyBean myBean3 = context.getBean(MyBean.class);

            System.out.println(myBean.getText());

            System.out.println(myBean); //  We will see that all beans have the same hash id.
            System.out.println(myBean2); // This is because Spring creates singleton beans by default.
            System.out.println(myBean3);
        }
    }
}

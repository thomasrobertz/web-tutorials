package config;

import beans.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfiguration {

    // By using this annotation, the INSTANCE of the bean will be automatically placed into the spring context.
    @Bean
    @Primary
    public MyBean myBean() { // Usually we would put  a verb in the name, like "getMyBean" but this is a special case, we just use the bean name.
        MyBean b = new MyBean();
        b.setText("Hello");
        return b;
    }

    @Bean
    public MyBean myBean2() { // We declare a second @Bean annotated method for type MyBean.
        MyBean b = new MyBean();
        b.setText("World");
        return b;
    }
}

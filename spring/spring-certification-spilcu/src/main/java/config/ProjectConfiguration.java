package config;

import beans.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfiguration {

    // By using this annotation, the INSTANCE of the bean will be automatically placed into the spring context.
    @Bean
    public MyBean myBean() { // Usually we would put  a verb in the name, like "getMyBean" but this is a special case, we just use the bean name.
        MyBean b = new MyBean();
        b.setText("Hello");
        return b;
    }
}

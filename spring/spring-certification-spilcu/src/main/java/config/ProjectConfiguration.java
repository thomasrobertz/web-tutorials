package config;

import beans.Cat;
import beans.Owner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "beans" )
public class ProjectConfiguration {
    @Bean
    public Cat cat() {
        Cat c = new Cat();
        c.setName("Tom");
        return c;
    }

    @Bean
    public Owner owner(Cat cat) { // Inject cat
        Owner o = new Owner();
        o.setCat(cat);
        return o;
    }
}

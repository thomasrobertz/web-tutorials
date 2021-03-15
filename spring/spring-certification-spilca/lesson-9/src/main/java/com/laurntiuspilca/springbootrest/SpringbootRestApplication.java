package com.laurntiuspilca.springbootrest;

import com.laurntiuspilca.springbootrest.model.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootRestApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringbootRestApplication.class, args);

		context.registerShutdownHook();

		Cat cat = context.getBean(Cat.class);
		System.out.println(cat);

		// This would work but would shut down our app immediately
		//context.close();

		// Instead we can register a JVM shutdown hook...
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				context.close();
			}
		});
		// ... we pretend that someone closes our application gracefully
		System.exit(0);

	}

	@Bean
	public Cat testBeanDesctructionHook() {
		return new Cat("Tom");
	}
}

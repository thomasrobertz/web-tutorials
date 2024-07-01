package de.robertz.webflux;

import java.util.stream.IntStream;

import de.robertz.webflux.student.Student;
import de.robertz.webflux.student.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WebFluxDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebFluxDemoApplication.class, args);
	}

	/*
	@Bean
	public CommandLineRunner init(StudentService studentService) {
		return args -> IntStream.range(1, 100).forEach(i -> {
			studentService.save(Student.builder()
							.firstname("Tom" + i)
							.lastname("R" + i)
							.age(i)
					.build())
					.subscribe(); // Nothing will happen unless we subscribe (or perform other terminal op)
		});
	}
		*/
}

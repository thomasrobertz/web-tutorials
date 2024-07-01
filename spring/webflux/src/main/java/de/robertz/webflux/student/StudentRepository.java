package de.robertz.webflux.student;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface StudentRepository extends ReactiveCrudRepository<Student, Integer> {

	// Custom query, just like in JPA
	Flux<Student> findAllByFirstnameIgnoreCase(String firstname);
}

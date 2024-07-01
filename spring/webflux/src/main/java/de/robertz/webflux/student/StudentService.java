package de.robertz.webflux.student;

import java.time.Duration;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class StudentService {
	private final StudentRepository studentRepository;

	public Mono<Student> save(Student s) {
		return studentRepository.save(s);
	}

	// Flux = many
	public Flux<Student> findAll() {
		return studentRepository
				.findAll()
				// Simulate some processing
				.delayElements(Duration.ofMillis(250L));
	}

	// Mono = one
	public Mono<Student> findById(Integer id) {
		return studentRepository.findById(id);
	}
}

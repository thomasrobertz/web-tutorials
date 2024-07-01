package de.robertz.webflux.student;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Builder
@Table(name = "student") // No @Entity in reactive
public class Student {
	@Id // Careful to also choose package org.springframework.data
	private Integer id;
	private String firstname;
	private String lastname;
	private Integer age;
}

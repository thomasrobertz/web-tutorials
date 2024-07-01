package de.robertz.webflux.student;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table // No @Entity in reactive
public class Student {
	@Id // Careful to also choose package org.springframework.data
	private Integer id;
	private String firstname;
	private String lastname;
	private Integer age;
}

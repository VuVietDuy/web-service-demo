package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "students")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	@Id
	private Long id;

	@Column(name = "full_name", nullable = true)
	private String fullName;

	@Column(name = "date_of_birth", nullable = true)
	private String dateOfBirth;

	@Column(name = "gender", nullable = true)
	private String gender;

	@Column(name = "administrative_class", nullable = true)
	private String administrativeClass;

	@Column(name = "gpa", nullable = true)
	private float gpa;

}

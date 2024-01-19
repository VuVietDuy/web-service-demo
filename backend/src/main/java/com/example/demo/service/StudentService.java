package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;
import org.springframework.http.ResponseEntity;

public interface StudentService {
	List<Student> getAllStudents();
	Student createNewStudent(Student student);
	Student updateStudent(Student student);
	void deleteStudentById(Long studentId);
	Student getStudentById(Long id);
}

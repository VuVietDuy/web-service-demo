package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
	private StudentService service;
	
	public StudentController(StudentService studentService) {
        this.service = studentService;
    }
	
	@GetMapping("")
	public List<Student> getAllStudents() {
		return service.getAllStudents();
	}
	
	@GetMapping("/{id}")
	public Student getStudentById(@PathVariable("id") Long id) {
		return service.getStudentById(id);
	}
	
	@PostMapping("")
	public Student createNewStudent(Student s) {
		return service.createNewStudent(s);
	}

	@PutMapping("/{id}")
	public ResponseEntity<String> updateStudentById(@PathVariable("id") Long id, @RequestBody Student updatedStudent) {
		Student existingStudent = service.getStudentById(id);

		if (existingStudent == null) {
			return new ResponseEntity<>("Student not found", HttpStatus.NOT_FOUND);
		}

		Student s = service.updateStudent(updatedStudent);

		return new ResponseEntity<>("Student entity updated successfully", HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudentById(@PathVariable("id") Long id) {
        service.deleteStudentById(id);
        return new ResponseEntity<>("Student entity deleted successfully", HttpStatus.OK);
    }
}

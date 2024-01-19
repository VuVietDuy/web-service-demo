package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepo;
import com.example.demo.service.StudentService;

import jakarta.persistence.EntityNotFoundException;

@Service
public class StudentServiceImpl implements StudentService{

	private StudentRepo repo;
	
	public StudentServiceImpl(StudentRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
	@Override
	public Student getStudentById(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Entity not found with id: " + id));
	}

	@Override
	public Student createNewStudent(Student student) {
		// TODO Auto-generated method stub
		return repo.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		return repo.save(student);
	}


	@Override
    public void deleteStudentById(Long id) {
        repo.deleteById(id);
    }

}

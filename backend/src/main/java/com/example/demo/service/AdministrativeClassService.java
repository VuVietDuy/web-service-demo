package com.example.demo.service;

import com.example.demo.entity.AdministrativeClass;
import com.example.demo.entity.Student;

import java.util.List;

public interface AdministrativeClassService {
	List<AdministrativeClass> getAllAdministrativeClasss();
	Student createNewAdministrativeClass(AdministrativeClass t);
	void deleteAdministrativeClassById(Long id);
	Student getAdministrativeClassById(Long id);
}

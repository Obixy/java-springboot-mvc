package com.obixy.firstproject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.obixy.firstproject.models.Department;
import com.obixy.firstproject.repositories.DepartmentRepository;

@RestController
@RequestMapping(value = "/departments")
public class DepartmentController {

	/*
	 * 
	 * */
	@Autowired
	private DepartmentRepository repository;

	@GetMapping
	public ResponseEntity<List<Department>> findAll() {
		List<Department> departments = repository.findAll();
		return ResponseEntity.ok().body(departments);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Department> findById(@PathVariable Long id) {
		Department department = repository.findById(id);
		return ResponseEntity.ok().body(department);
	}

}

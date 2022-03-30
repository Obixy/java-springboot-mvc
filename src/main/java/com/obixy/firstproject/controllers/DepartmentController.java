package com.obixy.firstproject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.obixy.firstproject.models.Department;
import com.obixy.firstproject.repositories.DepartmentRepository;

@RestController
@RequestMapping(value = "/departments")
public class DepartmentController {

	@Autowired
	private DepartmentRepository departmentRepository;

	@GetMapping
	public ResponseEntity<List<Department>> findAll() {
		List<Department> departments = departmentRepository.findAll();
		return ResponseEntity.ok().body(departments);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Department> findById(@PathVariable Long id) {
		Department department = departmentRepository.findById(id).get();
		return ResponseEntity.ok().body(department);
	}

	@PostMapping
	public Department insert(@RequestBody Department employee) {
		return departmentRepository.save(employee);
	}

}

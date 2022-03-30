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

import com.obixy.firstproject.models.Employee;
import com.obixy.firstproject.repositories.EmployeeRepository;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {

	@Autowired
	private EmployeeRepository repository;

	@GetMapping
	public ResponseEntity<List<Employee>> findAll() {
		List<Employee> employees = repository.findAll();
		return ResponseEntity.ok().body(employees);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Employee> findById(@PathVariable Long id) {
		Employee employee = repository.findById(id).get();
		return ResponseEntity.ok().body(employee);
	}

	@PostMapping
	public Employee insert(@RequestBody Employee employee) {
		return repository.save(employee);
	}

}

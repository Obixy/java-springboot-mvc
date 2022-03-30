package com.obixy.firstproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.obixy.firstproject.models.Department;
import com.obixy.firstproject.repositories.DepartmentRepository;

@SpringBootApplication
public class FirstprojectApplication implements CommandLineRunner {

	@Autowired
	private DepartmentRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(FirstprojectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Department category1 = new Department(1L, "Electronics");
		Department category2 = new Department(2L, "Books");

		repository.save(category1);
		repository.save(category2);
	}

}

package com.obixy.firstproject;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.obixy.firstproject.models.Department;
import com.obixy.firstproject.models.Employee;
import com.obixy.firstproject.repositories.DepartmentRepository;
import com.obixy.firstproject.repositories.EmployeeRepository;

@SpringBootApplication
public class FirstprojectApplication implements CommandLineRunner {

	@Autowired
	private DepartmentRepository departmentRepository;

	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(FirstprojectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Department department1 = new Department(1L, "Jogos");
		Department department2 = new Department(2L, "Livros");

		Employee emp1 = new Employee(1L, "Adeilton Rodrigues", 19, 80.5, 2000.0, department1);
		Employee emp2 = new Employee(2L, "Oscar Marques", 19, 80.5, 2000.0, department2);
		Employee emp3 = new Employee(3L, "Guilherme Santos", 19, 80.5, 2000.0, department1);
		Employee emp4 = new Employee(4L, "Luiz Felipe", 19, 80.5, 2000.0, department2);

		department1.getEmployees().addAll(Arrays.asList(emp1, emp3));
		department2.getEmployees().addAll(Arrays.asList(emp2, emp4));

		departmentRepository.save(department1);
		departmentRepository.save(department2);

		employeeRepository.save(emp1);
		employeeRepository.save(emp2);
		employeeRepository.save(emp3);
		employeeRepository.save(emp4);
	}

}

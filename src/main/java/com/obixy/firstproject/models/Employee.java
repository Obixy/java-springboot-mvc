package com.obixy.firstproject.models;

import java.util.Objects;

public class Employee {

	private Long id;
	private String name;
	private Integer age;
	private Double weight;
	private Double salary;

	private Department department;

	public Employee() {

	}

	public Employee(Long id, String name, Integer age, Double weight, Double salary, Department department) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.salary = salary;
		this.department = department;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "id: " + id + " | Name: " + name + " | Age: " + age + " | Weight: " + weight + " | Salary: " + salary
				+ " | Department: " + department.getName() + " |";
	}

}

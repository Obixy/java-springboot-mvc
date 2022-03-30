package com.obixy.firstproject.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.obixy.firstproject.models.Employee;

@Component
public class EmployeeRepository {

	/**
	 * Map ou Dictionary
	 * 
	 * Coleção de pares chave-valor
	 */
	private Map<Long, Employee> map = new HashMap<>();

	public void save(Employee obj) {
		map.put(obj.getId(), obj);
	}

	public Employee findById(Long id) {
		return map.get(id);
	}

	public List<Employee> findAll() {
		return new ArrayList<Employee>(map.values());
	}

}

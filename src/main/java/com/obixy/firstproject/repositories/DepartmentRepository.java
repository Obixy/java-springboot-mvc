package com.obixy.firstproject.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.obixy.firstproject.models.Department;

@Component
public class DepartmentRepository {

	/**
	 * Map ou Dictionary
	 * 
	 * Coleção de pares chave-valor
	 */
	private Map<Long, Department> map = new HashMap<>();

	public void save(Department obj) {
		map.put(obj.getId(), obj);
	}

	public Department findById(Long id) {
		return map.get(id);
	}

	public List<Department> findAll() {
		return new ArrayList<Department>(map.values());
	}

}
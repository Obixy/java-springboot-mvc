package com.obixy.firstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.obixy.firstproject.models.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
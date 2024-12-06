package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.Employee;

public interface EmpRepository extends JpaRepository<Employee, Long>{

}

package com.springboot.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.springboot.model.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployee();
	void save(Employee employee);
	Employee getEmployeeById(Long id);
	void deleteEmployeeById(Long id);

}

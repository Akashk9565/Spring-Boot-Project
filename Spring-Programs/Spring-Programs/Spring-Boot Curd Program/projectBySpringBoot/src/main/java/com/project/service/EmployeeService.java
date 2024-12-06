package com.project.service;

import java.util.List;

import com.project.entity.Employee;

public interface EmployeeService {
	
	Employee save(Employee employee);
	
	Employee getEmployeeById (Long id);
	
	List<Employee> getAllEmployee();
	
	Employee update(Long id, Employee employee);

	void delete(Long id);
	
}

package com.springboot.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.Employee;
import com.springboot.repository.EmployeeRepository;
import com.springboot.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public List<Employee> getAllEmployee() {
		
		return employeeRepository.findAll();
	}
	@Override
	public void save(Employee employee) {
		this.employeeRepository.save(employee);
		
	}
	@Override
	public Employee getEmployeeById(Long id) {
		Optional<Employee> optinal = employeeRepository.findById(id);
		Employee employee = null;
		if(optinal.isPresent()) {
			employee = optinal.get();
		}else {
			throw new RuntimeException("Employee Not Found for id: "+id);
		}
		return employee;
	}
	@Override
	public void deleteEmployeeById(Long id) {
		this.employeeRepository.deleteById(id);
		
	}

}

package com.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entity.Employee;
import com.project.exception.ResourceNotFoundException;
import com.project.repository.EmpRepository;
import com.project.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmpRepository empRepository;

	@Override
	public Employee save(Employee employee) {
		Employee save = empRepository.save(employee);
		return save;
	}

	@Override
	public Employee getEmployeeById(Long id) {
		Employee foundEmployee = empRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not found: "+id));
		return foundEmployee;
	}

	@Override
	public List<Employee> getAllEmployee() {
		return empRepository.findAll();
	}

	@Override
	public Employee update(Long id, Employee employee) {
		Employee foundEmployee = empRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not found: "+id));
		foundEmployee.setHatc(employee.getHatc());
		Employee save = empRepository.save(foundEmployee);
		return save;
	}

	@Override
	public void delete(Long id) {
		Employee foundEmployee = empRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not found"+id));
		empRepository.delete(foundEmployee);
		
	}

}

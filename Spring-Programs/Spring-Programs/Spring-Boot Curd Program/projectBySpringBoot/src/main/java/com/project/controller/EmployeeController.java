package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Employee;
import com.project.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping
	public ResponseEntity<Employee> create(@RequestBody Employee employee){
		Employee save = employeeService.save(employee);
		return new ResponseEntity<Employee>(save, HttpStatus.CREATED);
	}
	

	@GetMapping
	public ResponseEntity<List<Employee>> getAllEmp(){
		List<Employee> allEmployee = employeeService.getAllEmployee();
		return ResponseEntity.ok(allEmployee);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Employee> getSingleEmp(@PathVariable Long id){
		Employee getEmployeeById = employeeService.getEmployeeById(id);
		return ResponseEntity.ok(getEmployeeById);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Employee> update(@PathVariable Long id, @RequestBody Employee employee){
		Employee updated = employeeService.update(id, employee);
		return ResponseEntity.ok(updated);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Long id){
		employeeService.delete(id);
		return ResponseEntity.ok("Employee deleted");
	}
	
}

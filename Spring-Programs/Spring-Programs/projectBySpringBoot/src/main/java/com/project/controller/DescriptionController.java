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

import com.project.entity.Description;
import com.project.service.DescriptionService;

@RestController
@RequestMapping("/api/master/{masterId}/desc")
public class DescriptionController {

	@Autowired
	private DescriptionService descriptionService;
	
	@PostMapping
	public ResponseEntity<Description> create(@RequestBody Description description, @PathVariable Long masterId){
		Description save = descriptionService.save(description,masterId);
		return new ResponseEntity<Description>(save, HttpStatus.CREATED);
	}
	

	@GetMapping
	public ResponseEntity<List<Description>> getAllDescription(){
		List<Description> allDescription = descriptionService.getAllEmployee();
		return ResponseEntity.ok(allDescription);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Description> getSingleEmp(@PathVariable Long id){
		Description getEmployeeById = descriptionService.getEmployeeById(id);
		return ResponseEntity.ok(getEmployeeById);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Description> update(@PathVariable Long id, @RequestBody Description description){
		Description updated = descriptionService.update(id, description);
		return ResponseEntity.ok(updated);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Long id){
		descriptionService.delete(id);
		return ResponseEntity.ok("Description deleted");
	}
	
}

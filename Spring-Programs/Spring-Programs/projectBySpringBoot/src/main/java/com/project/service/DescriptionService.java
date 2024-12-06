package com.project.service;

import java.util.List;

import com.project.entity.Description;

public interface DescriptionService {
	
	Description save(Description description,Long masterId);
	
	Description getEmployeeById (Long id);
	
	List<Description> getAllEmployee();
	
	Description update(Long id, Description description);

	void delete(Long id);
	
}

package com.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entity.Description;
import com.project.entity.HierarchyMaster;
import com.project.exception.ResourceNotFoundException;
import com.project.repository.DescriptionRepository;
import com.project.repository.HierarchyMasterRepository;
import com.project.service.DescriptionService;

@Service
public class DescriptionServiceImpl implements DescriptionService{
	
	@Autowired
	private DescriptionRepository descriptionRepository;
	
	@Autowired
	private HierarchyMasterRepository masterRepository;
	

	@Override
	public Description save(Description description, Long masterId) {
		HierarchyMaster hierarchyMaster = masterRepository.findById(masterId).orElseThrow(() -> new ResourceNotFoundException("Hierarchy master id is not found "));
		description.setHierarchyMaster(hierarchyMaster);
		Description save = descriptionRepository.save(description);
		return save;
	}

	@Override
	public Description getEmployeeById(Long id) {
		Description foundEmployee = descriptionRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Description not found: "+id));
		return foundEmployee;
	}

	@Override
	public List<Description> getAllEmployee() {
		return descriptionRepository.findAll();
	}

	@Override
	public Description update(Long id, Description description) {
		Description foundDescription = descriptionRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Description not found: "+id));
		foundDescription.setHirerarchyAtribute(description.getHirerarchyAtribute());
		foundDescription.setHirerarchyCode(description.getHirerarchyCode());
		Description save = descriptionRepository.save(foundDescription);
		return save;
	}

	@Override
	public void delete(Long id) {
		Description foundEmployee = descriptionRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Description not found"+id));
		descriptionRepository.delete(foundEmployee);
		
	}

}

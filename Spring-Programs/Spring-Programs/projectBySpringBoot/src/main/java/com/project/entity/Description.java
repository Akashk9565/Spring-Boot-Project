package com.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
public class Description {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String hirerarchyAtribute;
	
	private String hirerarchyCode;

	@ManyToOne
	private HierarchyMaster hierarchyMaster;

	public Description() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Description(Long id, String hirerarchyAtribute, String hirerarchyCode,
			HierarchyMaster hierarchyMaster) {
		super();
		this.id = id;
		this.hirerarchyAtribute = hirerarchyAtribute;
		this.hirerarchyCode = hirerarchyCode;
		this.hierarchyMaster = hierarchyMaster;
	}

	public Description(String hirerarchyAtribute, String hirerarchyCode, HierarchyMaster hierarchyMaster) {
		super();
		this.hirerarchyAtribute = hirerarchyAtribute;
		this.hirerarchyCode = hirerarchyCode;
		this.hierarchyMaster = hierarchyMaster;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHirerarchyAtribute() {
		return hirerarchyAtribute;
	}

	public void setHirerarchyAtribute(String hirerarchyAtribute) {
		this.hirerarchyAtribute = hirerarchyAtribute;
	}

	public String getHirerarchyCode() {
		return hirerarchyCode;
	}

	public void setHirerarchyCode(String hirerarchyCode) {
		this.hirerarchyCode = hirerarchyCode;
	}

	public HierarchyMaster getHierarchyMaster() {
		return hierarchyMaster;
	}

	public void setHierarchyMaster(HierarchyMaster hierarchyMaster) {
		this.hierarchyMaster = hierarchyMaster;
	}

	@Override
	public String toString() {
		return "Description [id=" + id + ", hirerarchyAtribute=" + hirerarchyAtribute + ", hirerarchyCode="
				+ hirerarchyCode + ", hierarchyMaster=" + hierarchyMaster + "]";
	}
	
	

}

package com.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "hierarchy_master")
public class HierarchyMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String hatc;

	public HierarchyMaster() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HierarchyMaster(Long id, String hatc) {
		super();
		this.id = id;
		this.hatc = hatc;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHatc() {
		return hatc;
	}

	public void setHatc(String hatc) {
		this.hatc = hatc;
	}

}

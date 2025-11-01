package com.ibm.infrafix.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CrewDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long ID;
	
	String name;
	String type;
	Integer count;
	Integer assigned;	
	
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Integer getAssigned() {
		return assigned;
	}
	public void setAssigned(Integer assigned) {
		this.assigned = assigned;
	}	
	

	public CrewDetails(Long iD, String name, String type, Integer count) {
		super();
		ID = iD;
		this.name = name;
		this.type = type;
		this.count = count;
	}
	
	

}

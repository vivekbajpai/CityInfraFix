package com.ibm.infrafix.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Citizen {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Long id;
String name;
String address;
String email;



public Citizen() {
	
}

public Citizen(Long id, String name, String address, String email) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
	this.email = email;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}


}

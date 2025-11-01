package com.ibm.infrafix.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.infrafix.jpa.CitizenRepository;
import com.ibm.infrafix.model.Citizen;

@RestController
@RequestMapping("citizen")		
public class CitizenController {
	
	@Autowired
	public CitizenRepository repository;
	
	@PostMapping
	public Citizen createCitizen(@RequestBody Citizen citizen) {
		try {
			return repository.save(citizen);
		}catch(Exception e) {
			return repository.save(citizen);
		}
		
	}
	
	@GetMapping("/email/{email}")
	public List<Citizen> getCitizenbyEmail(@PathVariable String email) {
		return repository.findAllByEmail(email).get();
		
	}

}

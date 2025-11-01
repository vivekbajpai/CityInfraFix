package com.ibm.infrafix.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.infrafix.jpa.CrewRepository;
import com.ibm.infrafix.model.CrewDetails;

@RestController
@RequestMapping("crew")
public class CrewController {
	
	@Autowired
	CrewRepository repository;
	
	
	@PostMapping
	public String addCrewRecords(@RequestBody List<CrewDetails>  listCrew) {
		try {
		 repository.saveAll(listCrew);
		 return "Records saved successfully";
		}
		catch(Exception e)
		{
			return e.getMessage();
			
		}
		
		
	}

	
	
}

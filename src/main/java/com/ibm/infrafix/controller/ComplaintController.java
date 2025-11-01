package com.ibm.infrafix.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.ibm.infrafix.jpa.ComplaintRepository;
import com.ibm.infrafix.model.ComplaintModel;
import com.ibm.infrafix.model.ComplaintModel.Status;

@RestController
@RequestMapping("/complains")
public class ComplaintController {

   	
	@Autowired
	ComplaintRepository respository;   
	
	@PostMapping
	public String createComplain(@RequestParam String  email, @RequestParam String description, @RequestParam String location, @RequestParam MultipartFile file) {
		try
		{	
		ComplaintModel complain = new ComplaintModel();
		complain.setContent(file.getBytes());
		complain.setEmailId(email);
		complain.setLocation(location);
		complain.setDescription(description);
		complain.setStatus(Status.NEW);
		complain.setCreatedDate(new Date(System.currentTimeMillis()));
		 ComplaintModel res= respository.save(complain);
		 return "Complain registered sucessfully,ID :" +res.getId() ;
		}
        catch (Exception e) {return "Compaint registration failed:" ;
			// TODO: handle exception
		}	
		
			
		}
	
	@GetMapping("/{id}")
	public ComplaintModel getComplaintbyId(@PathVariable Long id) {
		return respository.getById(id);
		
	}
	
	@PutMapping("/resolve")
	public String getResoveComplain(@RequestParam Long id) {
		try {
			ComplaintModel complaintModel = respository.getById(id);
			complaintModel.setResolutionDate(new Date(System.currentTimeMillis()));
			respository.save(complaintModel);
			return "Record saved";
		}catch(Exception e) {
			return e.getMessage();
		}	
		
	}
	
	@GetMapping("/resolvedtoday")
	public List<ComplaintModel> getTodayResoved() {
		List<ComplaintModel> list = null;
		try {
			 list=respository.findByResolutionDate(new Date(System.currentTimeMillis()));		
				
		}catch(Exception e) {
			e.printStackTrace();
			//return e.getMessage();
		}	
		return list;
	}
	
	@GetMapping("/unresolved")
	public List<ComplaintModel> getUnresolvedComplaints() {
		List<ComplaintModel> complainList= respository.findByStatus(Status.NEW);
		complainList.addAll(respository.findByStatus(Status.IN_PROGRESS));
		return complainList;
		
	}

}

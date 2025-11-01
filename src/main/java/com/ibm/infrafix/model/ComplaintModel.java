package com.ibm.infrafix.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class ComplaintModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String emailId;
	String description;
    String location;
    Status status;    
    Date   createdDate;
	Date   resolutionDate;
    
    public enum Status {
    	NEW,
        UNRESOLVED,
        RESOLVED,
        IN_PROGRESS
    }
    
     // Indicates a large object, suitable for bytea
    @Lob
    @Column(name = "content", columnDefinition = "BIGINT") // Explicitly define column type
    private byte[] content;
    
    public ComplaintModel() {
    	super();		
	}
    
    
    public ComplaintModel(Long id, String description, String location) {
		super();
		this.id = id;
		this.description = description;
		this.location = location;
	}
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public byte[] getContent() {
		return content;
	}


	public void setContent(byte[] content) {
		this.content = content;
	}
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}


	public Date getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(Date createDate) {
		this.createdDate = createDate;
	}


	public Date getResolutionDate() {
		return resolutionDate;
	}


	public void setResolutionDate(Date resolutionDate) {
		this.resolutionDate = resolutionDate;
	}	
	
	
    
}

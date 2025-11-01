package com.ibm.infrafix.jpa;
import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.infrafix.model.ComplaintModel;
import com.ibm.infrafix.model.ComplaintModel.Status;

@Repository
public interface ComplaintRepository extends JpaRepository<ComplaintModel, Long> {

	public List<ComplaintModel> findByStatus(Status status);
	public List<ComplaintModel> findByResolutionDate(Date date);
}

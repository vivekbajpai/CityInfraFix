package com.ibm.infrafix.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.infrafix.model.CrewDetails;

@Repository
public interface CrewRepository extends JpaRepository<CrewDetails, Long> {

}

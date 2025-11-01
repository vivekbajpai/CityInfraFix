package com.ibm.infrafix.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.infrafix.model.Citizen;

@Repository
public interface CitizenRepository extends JpaRepository<Citizen, Long> {
	
	Optional<List<Citizen>> findAllByEmail(String email);

}

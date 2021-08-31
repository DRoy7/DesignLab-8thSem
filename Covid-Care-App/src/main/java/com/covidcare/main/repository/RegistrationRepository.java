package com.covidcare.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.covidcare.main.models.Registration;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Integer> {


	public Registration findTopByOrderByIdDesc();
}

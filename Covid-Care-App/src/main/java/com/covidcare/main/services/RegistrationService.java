package com.covidcare.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covidcare.main.models.Registration;
import com.covidcare.main.repository.RegistrationRepository;

@Service
public class RegistrationService {

	@Autowired
	private RegistrationRepository repo;

	public void saveToDb(Registration registration) {
		// TODO Auto-generated method stub
		repo.save(registration);
	}
	
	public Registration get() {
		return repo.findTopByOrderByIdDesc();
	}
	
}

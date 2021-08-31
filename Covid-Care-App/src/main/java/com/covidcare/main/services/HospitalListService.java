package com.covidcare.main.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covidcare.main.models.Hospital;
import com.covidcare.main.repository.HospitalRepository;

@Service
public class HospitalListService {
	
	
	@Autowired
	private HospitalRepository repo;
	
	public List<Hospital> getHospitalList(){	// take the list from Database
		return repo.findAll();
		
	}
}

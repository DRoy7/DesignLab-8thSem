package com.covidcare.main.services;

import java.util.*;

import org.springframework.stereotype.Service;

import com.covidcare.main.models.Hospital;

@Service
public class HospitalListService {
	private List<Hospital> hospitalList = new ArrayList<>();
	
	public List<Hospital> getHospitalList(){	// take the list from Database
		if(hospitalList.isEmpty()) { //initialize
			this.hospitalList.add(new Hospital("Hospital-1", "Bihar", "Hajra", 10, "033-2424-6565", "Sarajis er bari"));
			this.hospitalList.add(new Hospital("Hospital-2", "Bihar", "Hajra", 20, "033-2424-6566", "Sarajis er bari"));
			this.hospitalList.add(new Hospital("Hospital-3", "Bihar", "Hajra", 30, "033-2424-6567", "Sarajis er bari"));
			this.hospitalList.add(new Hospital("Hospital-4", "Bihar", "Hajra", 40, "033-2424-6568", "Sarajis er bari"));
			this.hospitalList.add(new Hospital("Hospital-5", "Bihar", "Hajra", 100, "033-2424-6569", "Sarajis er bari"));
		}
		return this.hospitalList;
		
	}
}

package com.covidcare.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.covidcare.main.models.Hospital;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Integer>{

}

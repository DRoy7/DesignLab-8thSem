package com.covidcare.main.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Registration {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String hospital;
	private String name;
	private String gender;
	private int age;
	private String address;
	private String city;
	private int pin;
	private String state;
	private String mobileNumber;
	private String email;
	private String familyMemberName;
	private String familyMemberRelationship;
	private String familyMemberContact;
	private String rtpcrReport;
	private int oxygenLevel;
	private String otherMedicalProblems;
	private String symptoms;
	
}

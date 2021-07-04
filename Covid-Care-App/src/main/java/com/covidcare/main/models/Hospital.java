package com.covidcare.main.models;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Hospital {
	private String name;
	private String state;
	private String district;
	private int beds;
	private String contactNumber;
	private String address;
}

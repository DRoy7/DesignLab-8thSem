package com.covidcare.main.models;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class User {
	private String email;
	private int token;
}

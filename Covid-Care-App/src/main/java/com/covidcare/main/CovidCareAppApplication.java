package com.covidcare.main;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class CovidCareAppApplication {
	
	private static Logger logger = LoggerFactory.getLogger(CovidCareAppApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(CovidCareAppApplication.class, args);
		logger.info("Covid app started");
	}

}

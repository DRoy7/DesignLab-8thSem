package com.covidcare.main.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControllerForHome {
	// Directs to Mourima's page -> Home-Page
	@RequestMapping(path= {"", "/", "/home"}, method = RequestMethod.GET)
	public String home() {	// returns home-page
		return "home-Mourima.html";
	}
	
	// Directs to Deep's page -> About-Page
	@RequestMapping(path= {"/about"}, method = RequestMethod.GET)
	public String about() {	// returns home-page
		return "about-Deep.html";
	}

	
}

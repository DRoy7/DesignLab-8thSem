package com.covidcare.main.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControllerForCases {
	// Directs to Deep's page -> Cases-Page
	@RequestMapping(path= {"/cases"}, method = RequestMethod.GET)
	public String cases() {	// returns home-page
		return "page1-Deep.html";
	}
	
	// Directs to Deep's page -> Cases{Iframe}-Page
	@RequestMapping(path= {"/page2"}, method = RequestMethod.GET)
	public String casesIframe() {	// returns home-page
		return "page2-Deep.html";
	}
}

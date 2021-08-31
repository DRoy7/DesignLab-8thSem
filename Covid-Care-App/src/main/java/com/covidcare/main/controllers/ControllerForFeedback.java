package com.covidcare.main.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControllerForFeedback {
	
	
	// Directs to Sarajis's page -> Feedback-Page
	@RequestMapping(path= {"/feedback"}, method = RequestMethod.GET)
	public String feedback() {	// returns feedback-page
		return "feedback-Sarajis.html";
	}

}

package com.covidcare.main.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.covidcare.main.models.Registration;
import com.covidcare.main.services.RegistrationService;

@Controller
public class ControllerForReg {
	
	@Autowired
	private RegistrationService regService;
	
	@RequestMapping(path= {"/registrations"}, method=RequestMethod.GET)
	public String register(Model model) {
		model.addAttribute("abc",new Registration());
		return "Reg-Avyudoy.html";
	}
	
	// Directs to Avyudoy's page -> Reg-Page(Get)
	@RequestMapping(path= {"/save-registrations"}, method = RequestMethod.POST)
	public String register(@ModelAttribute Registration registration, Model model) {	// returns Reg-page for editing
		regService.saveToDb(registration);
		model.addAttribute("hos", registration.getHospital());
		model.addAttribute("def", regService.get());
		return "ApplForm_output.html";
	}
}

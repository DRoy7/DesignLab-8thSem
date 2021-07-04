package com.covidcare.main.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.covidcare.main.models.User;

@Controller
public class ControllerForReg {
	// Directs to Deep's page -> RegAsk-Page(Get)
	@RequestMapping(path= {"/registrations"}, method = RequestMethod.GET)
	public String cases() {	// returns RegAsk-page for editing
		return "askToReg-Deep.html";
	}
	
	// Directs to Deep's page -> RegAsk-Page(Get)
	@RequestMapping(path= {"/login"}, method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("user") User user) {	// returns hospitalAvailable-page for editing
		ModelAndView mav = new ModelAndView();
		mav.addObject("user", user);
		mav.setViewName("hospitalAvailable-Deep.html");
		return mav;
	}
	
	// Directs to Avyudoy's page -> Reg-Page(Get)
	@RequestMapping(path= {"/register"}, method = RequestMethod.GET)
	public String register() {	// returns Reg-page for editing
		return "Reg-Avyudoy.html";
	}
}

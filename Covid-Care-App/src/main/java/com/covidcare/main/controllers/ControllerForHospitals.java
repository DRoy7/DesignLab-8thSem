package com.covidcare.main.controllers;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.covidcare.main.models.Hospital;
import com.covidcare.main.services.HospitalListService;

@Controller
public class ControllerForHospitals {
	@Autowired
	private HospitalListService hosplistService;
	
	// Directs to Risav's page -> Hospitals-Page(Get)
	@RequestMapping(path= {"/hospitals"}, method = RequestMethod.GET)
	public ModelAndView hospitals() {	// returns RegAsk-page for editing
		ModelAndView mav = new ModelAndView();
		// get all hospitals list and put in model addObject, show the list in table in html
		List<Hospital> hospitalList = hosplistService.getHospitalList();
		mav.addObject("hospitals", hospitalList);
		mav.setViewName("hospitals-Risav.html");
		return mav;
	}
}

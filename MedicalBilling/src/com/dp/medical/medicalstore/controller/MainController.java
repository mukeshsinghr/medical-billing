package com.dp.medical.medicalstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MainController {
	
	@RequestMapping(value="/home.do")
	public ModelAndView mainPage() {
		System.out.println("in main controller");
		return new ModelAndView("/jsp/login");
	}
}

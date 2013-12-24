package com.dp.medical.medicalstore.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class MainController {
	
	@RequestMapping("/jsp/medical-invoice")
    public String mypage(Model model, Principal principal) {
        String userName = principal.getName();
        model.addAttribute("message", "Hi " + userName + ", Welcome to 'Spring Security Custom Login Form Example'");
 
        return "jsp/medical-invoice";
    }
     
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logoutPage() {
        return "logout";
    }
     
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage() {
        return "login";
    }
}

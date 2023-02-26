package com.thymeleaf.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String test(Model model)
	{
		model.addAttribute("name", "Ahmad Abid");
		model.addAttribute("Age", 19);
		System.out.println("I am inside Test");
		return "test";
	}
}

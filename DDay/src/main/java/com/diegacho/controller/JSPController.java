package com.diegacho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Index")
public class JSPController {

	@GetMapping("/Welcome")
	public String welcome() {
		return "GymForm";
	}
	
}

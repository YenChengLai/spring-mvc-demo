package com.java.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	// Controller Method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	// Controller Method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		
		return "helloworld";
	}
}

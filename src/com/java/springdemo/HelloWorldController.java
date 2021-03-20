package com.java.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;

@RequestMapping("/hello")
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

	// Controller Method to read form data and add data to the model
	@RequestMapping("/processFormV2")
	public String sayHi(HttpServletRequest request, Model model) {

		// read the request parameter from the HTML form
		String studentName = request.getParameter("studentName");

		// convert the data to all capital
		studentName = studentName.toUpperCase();

		// add message to the model
		model.addAttribute("message", "Hi, " + studentName);
		return "helloworld";
	}
}

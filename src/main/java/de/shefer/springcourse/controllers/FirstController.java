package de.shefer.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstController {

	@GetMapping("/hello")
	public String helloPage(@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "surname", required = false) String surname, Model model) {

		// System.out.println("Name: " + name + ", surname: " + surname);
		model.addAttribute("message", "Name: " + name + ", surname: " + surname);
		return ("first/hello");
	}

	@GetMapping("/goodbye")
	public String goodByePage() {
		return "first/goodbye";
	}

	@GetMapping("/calculator")
	public String calculatorPage(@RequestParam(value = "a", required = false) Integer a,
			@RequestParam(value = "b", required = false) Integer b,
			@RequestParam(value = "action", required = true) String action, Model model) {
		if (action.equals("multiplication")) {
			model.addAttribute("message", "Multiplication a and b are: " + a * b);
		}
		if (action.equals("addition")) {
			model.addAttribute("message", "Addition a and b are: " + (a + b));
		}
		if (action.equals("substraction")) {
			model.addAttribute("message", "Substaction a and b are: " + (a - b));
		}
		if (action.equals("division")) {
			model.addAttribute("message", "Division a and b are: " + (a / b));
		}
		return "first/calculator";
	}
}

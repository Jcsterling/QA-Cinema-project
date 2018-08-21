package com.qa.QACinema.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String hello() {
		return "hello";
	}
	
	@GetMapping("/private")
	public String privateArea() {
		return "private";
	}
	

}

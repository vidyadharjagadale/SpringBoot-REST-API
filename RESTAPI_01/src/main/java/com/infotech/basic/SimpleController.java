package com.infotech.basic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	
	@GetMapping("/simple")
	public String testController() {
		
		return "From test Controller";
	}
	
	@GetMapping("/userDetails")
	public UserDetails details() {
		
		return new UserDetails("Vidyadhar", "Jagadale", "Pune");
	}

}

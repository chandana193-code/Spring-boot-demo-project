package com.dayone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test4")
public class Test4Controller {

	@GetMapping("/message")
	public String printMessage() {
		return "Hello Hanvith";
	}
	
	
}

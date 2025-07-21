package com.dayone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test2Controller {
	
	@GetMapping("/message")
	public String printMessage() {
		return "Hello Chandana";
	}

	@GetMapping("/getmessage")
	public String getmessage() {
		return "Hello Chandana";
	}
}

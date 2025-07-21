package com.dayone;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	
	 // Reading the custom message from YML file
    @Value("${custom.message}")
    private String msg;
	
	
	@GetMapping("/message")
	public String printMessage() {
		return msg;
	}

}


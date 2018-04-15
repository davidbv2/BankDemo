package com.company.bank.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StartController {
	
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hello World!";
		
	}
	
}

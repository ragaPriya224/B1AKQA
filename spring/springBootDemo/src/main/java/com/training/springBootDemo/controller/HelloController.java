package com.training.springBootDemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//what url mapping into it
//what method to run, when accessed it 
@RestController
public class HelloController {
	
	@RequestMapping("/hello")   //mapping this request to this method. it maps to GET METHOD BY DEFAULT
	public String toSayHello() {
		return "welcome user";
	}

}

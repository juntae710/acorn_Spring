package com.acorn.service;

import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyConttroller {

	
	@Autowired
	MyService Service;
	
	
	
	@RequestMapping("/joinus")
	public String register(String id , String name) {
		Service.userRegister(id, name);
		return "ok";
		
	}
}

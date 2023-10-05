package com.acorn.day1.di;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class pController3{
	
	
//메서드 단위
	
	
	//주입 
	@Autowired
	TestService service;
	
	
	@GetMapping("/list")
	public String test(Model model) {
		
		//Model
		ArrayList<String> list = service.getlist();
		model.addAttribute("list",list);
		return "memberList";
	}

}

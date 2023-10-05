package com.acorn.day1.ex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MakeBurger {

	@Autowired
	Burger b;
	
	@GetMapping("/make1")
	public String make() {
		String result = b.burger("불고기");
		System.out.println(result);
		return "make1";
	}
}

package com.acorn.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class hello2Controller {

	@ResponseBody
	@GetMapping("/data1")
	public String method() {
		return "hi";
	}
	
	@ResponseBody
	@GetMapping("data2")
	public User method2() {
		User user = new User("test02","1234");
		return user;
	}
}

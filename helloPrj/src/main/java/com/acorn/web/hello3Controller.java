package com.acorn.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class hello3Controller {

	@GetMapping("/model1")
	public String method1(Model model) {
		model.addAttribute("message", "파이팅 spring");
		return "model1";
	}

	@GetMapping("/model2")
	public String method2(Model model) {
		User user = new User("test03", "9999");
		model.addAttribute("user", user);
		return "model2";
	}

	@ResponseBody
	@GetMapping("/model3")
	public ArrayList<User> method3() {
		ArrayList<User> list = new ArrayList<>();
		list.add(new User("test01", "0000"));
		list.add(new User("test02", "1234"));
		list.add(new User("test03", "9999"));
		return list;
	}
}

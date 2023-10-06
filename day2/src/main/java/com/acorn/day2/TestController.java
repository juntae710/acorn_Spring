package com.acorn.day2;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {
//메서드 명을 뷰이름으로 할려면 String을 viod로 바꿔도 됨
//
	@Autowired
	TestServiec s;
	
	
	
	@RequestMapping("/gugudan")
	public String test1( @RequestParam(required=false, defaultValue="2")int dan , Model model) { //@RequestParam 생략
		ArrayList<String> danList =s.getDan(dan);
		model.addAttribute("list",danList);
		System.out.println(danList);
		return "test1";
	}
}

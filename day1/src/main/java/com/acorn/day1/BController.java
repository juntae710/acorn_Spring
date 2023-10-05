package com.acorn.day1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BController {

	@RequestMapping(value = "/test1" , method = RequestMethod.GET)
	public String test1() {
		//반환 타입 String  -> view 이름 의미함
		return "viewname";
	}
	
	@RequestMapping(value = "/test2" , method = RequestMethod.GET)
	public void test2() {
		//void 일때는 매핑정보를 view이름으로 인식함
		
	}
	@GetMapping("/test3")
	public void test3(){
		
	}
}

package com.acorn.day4.naver;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NaverController {
	
	@Autowired
	ApiExamSearchBlog api;
	
	@Autowired
	ApiExamSearchBlog2 api2;
	
	@ResponseBody
	@GetMapping(value ="/naver", produces = "application/json;charset=UTF-8")
	public String naverApi() {
		String result = api.getNaverAPI();
		return result;
		
	}
	
	@ResponseBody
	@GetMapping(value ="/naverList")
	public ArrayList<ItemDTO> naverapi2(){
		String result =api2.getNaverAPI();
		ArrayList<ItemDTO> list =api2.fromJSONtoItems(result);
		
		return list;
		
	}
	
	@RequestMapping("/naverList2")
	public String naverapi3(Model model){
		String result =api2.getNaverAPI();
		ArrayList<ItemDTO> list =api2.fromJSONtoItems(result);
		model.addAttribute("list", list);
		return "naverList2";
		
	}
}

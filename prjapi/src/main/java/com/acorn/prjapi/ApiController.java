package com.acorn.prjapi;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ApiController {
	@Autowired
	ApiExplorer api;
	
	@Autowired
	ApiExplorer2 api2;
	
	@Autowired
	ApiExplorer3 api3;
	
	@ResponseBody
	@GetMapping(value ="/apitest", produces = "application/json;charset=UTF-8")
	public String testapi() throws IOException {
		String result = api.testapi();
		return result;
		
	}
	

	@RequestMapping("/apitest2")
	public String testapi2(Model model) throws IOException {
		String result = api2.testapi();
		ArrayList<PMClass> list =api2.fromJSONtoItems(result);
	model.addAttribute("list", list);
		return "apitest2";
		
	}
	

	@RequestMapping("/apitest3")
	public String testapi3(Model model) throws IOException {
		String result = api3.testapi();
		ArrayList<PMClass2> list =api3.fromJSONtoItems(result);
	model.addAttribute("list", list);
		return "apitest3";
		
	}
	

	@RequestMapping("/apitest4")
	public String testapi4(Model model) throws IOException {
		String result = api2.testapi();
		ArrayList<PMClass> list =api2.fromJSONtoItems(result);
	model.addAttribute("list", list);
		return "apitest4";
		
	}
	
}

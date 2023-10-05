package com.acorn.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.acorn.web.User;

@Controller
public class Test {

	@GetMapping("test1")
	public String model1() {

		return "test1";
	}
	
	@ResponseBody
	@GetMapping("/test2")
	public ArrayList<String> model2(Model model) {
		ArrayList<String> list = new ArrayList<>();
		list.add("화이팅");
		list.add("Spring 1일차");
		list.add("열시미해보자");
		
		return list;
	}
	
	
	@ResponseBody
	@GetMapping(value = "/test3",produces="application/json;charset=UTF-8")
	public ArrayList<Book> model3() {
		ArrayList<Book> list = new ArrayList<>();
		list.add(new Book("무인도에서 살아남기","13000"));
		list.add(new Book("정글에서 살아남기","13000"));
		list.add(new Book("사막에서 살아남기","13000"));
		return list;
	}
	
	@GetMapping("/test4")
	public void model4(HttpServletResponse response) {
		
		try {
			response.setCharacterEncoding("UTF-8");
			response.setContentType("text/plain;charset=utf-8");
			response.getWriter().println("데이터가 간다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

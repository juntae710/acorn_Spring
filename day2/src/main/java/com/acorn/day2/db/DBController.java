package com.acorn.day2.db;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DBController {

	@Autowired
	TestDAO dao;
	
	@RequestMapping("/dbTest")
	public String test1() {
		dao.select();
		return "db1";
	}
	
	@RequestMapping("/bookList")
	public String test2(Model model) {
		ArrayList<Book> list= dao.selectbook();
		model.addAttribute("list", list);
		return "db2";
	}
}

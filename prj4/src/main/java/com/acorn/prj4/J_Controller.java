package com.acorn.prj4;

import java.util.ArrayList;

import org.apache.taglibs.standard.lang.jstl.Literal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class J_Controller {
	@Autowired
	J_Service s;
	
	@RequestMapping("/ss")
	public String selectstore(Model model) {
		ArrayList<J_Store> list= s.select();
		model.addAttribute("list", list);
		return "selectstore";
	}
	
	
	@ResponseBody
	@RequestMapping( value="/ss" , method=RequestMethod.POST)
	public void register(@RequestBody J_Store Store) {
		s.insert(Store);
	}
	
	@ResponseBody
	@RequestMapping( value="/ss/{storename}" , method=RequestMethod.DELETE)
	public void delete(@PathVariable J_Store storename) {
		s.delete(storename);
	}
	
	

//	@ResponseBody
//	@RequestMapping( value="/ss2" , method=RequestMethod.POST)
//	public   J_Store    register2(@RequestBody J_Store Store) {
//		  s.insert(Store);
//	     return Store;
//	}

}

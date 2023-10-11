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
	@RequestMapping( value="/ss/{storeName}" , method=RequestMethod.DELETE)
	public void delete(@PathVariable String storeName) {
		System.out.println("storeName" + storeName);
		s.delete(storeName);
	}
	
	@ResponseBody
	@RequestMapping( value="/ss" , method=RequestMethod.PUT)
	public void update(@RequestBody J_Store Store) {
		s.updata(Store);
	}
	
	@ResponseBody
	@RequestMapping( value="/sss" , method=RequestMethod.POST)
	public J_Store getList(@RequestBody String Store) {
		J_Store list = s.updataselect(Store);
		return list;
	}
//	@ResponseBody
//	@RequestMapping( value="/sss" , method=RequestMethod.GET)
//	public J_Store getList(@RequestBody String Store){		
//		
//		J_Store list = s.updataselect(Store);
//		return list;
//	}

//	@ResponseBody
//	@RequestMapping( value="/ss2" , method=RequestMethod.POST)
//	public   J_Store    register2(@RequestBody J_Store Store) {
//		  s.insert(Store);
//	     return Store;
//	}

}

package com.acorm.day5.ex;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExceptionCatcher {

	
	@RequestMapping("/db")
	public String method1() {
		String view="view1";
		try{
			throw new SQLException();			
		}catch(SQLException ex) {
			//오류 발생시 error페이지 보이도록
			view= "err";
		}
		
		return view;
	}
}

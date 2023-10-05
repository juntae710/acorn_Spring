package com.acorn.day1.di;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//객체생성
@Component

public class TestService {

	@Autowired
	TestDao dao;
	public ArrayList<String> getlist(){
		ArrayList<String> list = dao.selectAll();
		
		
		
		return list ;
		
	}
}

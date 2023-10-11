package com.acorn.day4.서버응답;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class 데이터응답 {

	@ResponseBody
	@GetMapping("/data")
	public String data1() {
		return "data !!";
	}
	// 자바겍체 - > json 변환해줌 라이브러리 pom.xml -< jackson data-bind
	@ResponseBody
	@GetMapping("/data2")
	public User data2() {
		User user = new User("test1", "1234");
		return user;
	}
	
	@ResponseBody
	@GetMapping("/data3")
	public void data3(HttpServletResponse response) throws IOException {
		String message="서버가 보내는 데이터";
		response.setContentType("text/plain;charse=utf-8");
		response.setHeader("content-length", String.valueOf(message.getBytes().length));
		response.getWriter().println(message);
		
	}
	
	@GetMapping("/data4")
	public ResponseEntity<String> data4(){
		String message="서버가 보내는 데이터";
		return ResponseEntity.ok().header("Content-Type", "text/plain;charset=utf-8")
				.header("Content-Length", String.valueOf(message.getBytes().length)).body(message);
	}
}

package com.acorm.day5.cookie;

import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@RequestMapping("/login")
	public String loginForm() {
		return "loginForm";
	}
	
	
	@RequestMapping(value = "/login" , method = RequestMethod.POST)
	public String loginForm(String id , String pwd , boolean rememberId , HttpServletResponse respons ,HttpServletRequest request) {
		
		//성공
		if(loginCheck(id,pwd)) {
			//세션저장
			HttpSession session = request.getSession();
			session.setAttribute("sessionId", session);
			//아이디 기억
			if(rememberId) {
				
				//저장
				Cookie cookie = new Cookie("id",id);
				respons.addCookie(cookie);
			}else {
				//삭제
				Cookie cookie = new Cookie("id",id);
				cookie.setMaxAge(0);
				respons.addCookie(cookie);
			}
			return "main";
			//실패
		}else {
			 String msg =URLEncoder.encode("id 또는 pwd 불일치.");
			return "redirect:/login/login?msg="+msg;
		}
	}
	
	@RequestMapping("/logOut")
	public String logOut(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.invalidate();
		return "redirect:/";
	}
	
	public boolean loginCheck(String id ,String pwd) {
		if(id.equals("aaa") && pwd.equals("1234")) {
			return true;
		}else {
			return false;
		}
		
	}
	
//	@RequestMapping("/login")
//	public String loginForm(String id , String pwd , boolean rememberId , HttpServletResponse respons) {
//		
//		System.out.println(id);
//		System.out.println(pwd);
//		System.out.println(rememberId);
//		
//		if(rememberId) {
//			Cookie cookie = new Cookie("id",id);
//			respons.addCookie(cookie);
//		}else {
//			Cookie cookie = new Cookie("id",id);
//			cookie.setMaxAge(0);
//			respons.addCookie(cookie);
//		}
//		return "loginForm";
//	}
}

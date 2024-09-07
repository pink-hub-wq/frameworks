package com.edu.seiryo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping({"/","/index.html"})
	public String index() {
		return "index";
	}
	
	@RequestMapping("/user/login")
	public String login(String username,String password,HttpSession session) {
		if("admin".equals(username)&&"123".equalsIgnoreCase(password)) {
			session.setAttribute("loginUser", username);
			return "redirect:/main.html";
		}
		return "index";
	}
}

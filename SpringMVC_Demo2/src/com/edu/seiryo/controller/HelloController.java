package com.edu.seiryo.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.edu.seiryo.entity.Address;
import com.edu.seiryo.entity.User;
import com.sun.org.apache.bcel.internal.generic.NEW;

@Controller
@RequestMapping("/HelloController")
@SessionAttributes(value = {"user"},types = {String.class})
public class HelloController {
	@RequestMapping("/hello")
	public String hello() {
		System.out.println("hello");
		return "success";
	}
	@RequestMapping("/helloParam")
	public String helloParam(@RequestParam(value = "name",required = false,defaultValue = "jessica")String name,
							 @RequestParam(value = "pwd",required = false,defaultValue = "123")String pwd) {
		System.out.println("helloParam: name = " + name);
		System.out.println("helloParam: pwd = " + pwd);
		return "success";
	}
	@RequestMapping("/helloHead")
	public String helloHead(@RequestHeader("referer")String referer) {
		System.out.println("helloHead: referer = " + referer);
		return "success";
	}
	@RequestMapping("/helloCookie")
	public String helloCookie(@CookieValue("JSESSIONID")String cookie) {
		System.out.println("helloHead: cookie = " + cookie);
		return "success";
	}
	@RequestMapping("/helloPOJO")
	public String helloPOJO(User user) {
		System.out.println("helloPOJO: user = " + user);
		return "success";
	}
	@RequestMapping("/helloPOJO2")
	public String helloPOJO2(User user) {
		System.out.println("helloPOJO2: user = " + user);
		return "success";
	}
	@RequestMapping("/helloServlet")
	public String helloServlet(HttpServletRequest request,HttpServletResponse response) {
		String name = request.getParameter("name");
		System.out.println("helloServlet: name = " + name);
		return "success";
	}
	@RequestMapping("/helloModelAndView")
	public ModelAndView helloModelAndView() {
		System.out.println("helloModelAndView");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("user", new User(1, "jessica", "123", new Address("paris", "123")));
		modelAndView.setViewName("success");
		return modelAndView;
	}
	@RequestMapping("/helloMap")
	public String helloMap(Map<String,Object> map) {
		System.out.println("helloMap");
		map.put("user", new User(1, "jessica", "123", new Address("paris", "123")));
		return "success";
	}
	@RequestMapping("/helloModel")
	public String helloModel(Model model) {
		System.out.println("helloModel");
		model.addAttribute("user", new User(1, "jessica", "123", new Address("paris", "123")));
		return "success";
	}
	@RequestMapping("/helloSession")
	public String helloSession(Model model,HttpSession session) {
		System.out.println("helloSession");
		model.addAttribute("user", new User(1, "jessica", "123", new Address("paris", "123")));
		session.setAttribute("user", model);
		return "success";
	}
	@RequestMapping("/helloSession2")
	public String helloSession2(Map<String,Object> map) {
		System.out.println("helloMap");
		map.put("user", new User(1, "jessica", "123", new Address("paris", "123")));
		map.put("name", "jessica");
		return "success";
	}
	@RequestMapping("/helloForWard")
	public String helloForWard(Map<String,Object> map) {
		System.out.println("helloForWard");
		map.put("user2", new User(1, "jessica", "123", new Address("paris", "123")));
		return "forward:/aaa.jsp";
	}
	@RequestMapping("/helloForWard2")
	public String helloForWard2(Map<String,Object> map) {
		System.out.println("helloForWard2");
		map.put("user2", new User(1, "jessica", "123", new Address("paris", "123")));
		return "redirect:/aaa.jsp";
	}
}

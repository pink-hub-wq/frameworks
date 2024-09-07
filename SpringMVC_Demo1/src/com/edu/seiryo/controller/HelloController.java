package com.edu.seiryo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/HelloController")
public class HelloController {
	@RequestMapping("/HelloGet")
	public String HelloGet() {
		System.out.println("HelloGet");
		return "success";
	}
	@RequestMapping(value = "/HelloPost",method = RequestMethod.POST)
	public String helloPost() {
		System.out.println("HelloPost");
		return "success";
	}
	@RequestMapping(value = "/add",params = {"name=jessica"})
	public String helloAdd() {
		System.out.println("helloAdd");
		return "success";
	}
	@RequestMapping(value = "/helloPath/*/aaa")
	public String helloPath() {
		System.out.println("helloPath");
		return "success";
	}
	@RequestMapping(value = "/helloPath2/aaa??")
	public String helloPath2() {
		System.out.println("helloPath2");
		return "success";
	}
	@RequestMapping(value = "/helloPath3/**/aaa")
	public String helloPath3() {
		System.out.println("helloPath3");
		return "success";
	}
	@RequestMapping(value = "/TestName/{name}")
	public String TestName(@PathVariable("name")String name) {
		System.out.println("TestName:" + name);
		return "success";
	}
	@RequestMapping(value = "/Test",method = RequestMethod.POST)
	public String Test1() {
		System.out.println("Test-post");
		return "success";
	}
	@RequestMapping(value = "/Test",method = RequestMethod.GET)
	public String Test2() {
		System.out.println("Test-get");
		return "success";
	}
	@RequestMapping(value = "/Test",method = RequestMethod.DELETE)
	public String Test3() {
		System.out.println("Test-delete");
		return "success";
	}
	@RequestMapping(value = "/Test/{id}",method = RequestMethod.PUT)
	public String Test4(@PathVariable("id") Integer id) {
		System.out.println("Test-put:" + id);
		return "success";
	}
}

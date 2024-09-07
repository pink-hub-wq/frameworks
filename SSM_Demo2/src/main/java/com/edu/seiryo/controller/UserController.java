package com.edu.seiryo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.edu.seiryo.entity.User;
import com.edu.seiryo.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;
	
	@RequestMapping("/allUser")
	public String list(Model model) {
		List<User> list = userService.queryAllUser();
		model.addAttribute("list", list);
		return "show";
	}
	@RequestMapping("/toAddUser")
	public String toAddUser() {
		return "input";
	}
	@RequestMapping("/update")
	public String update(@RequestParam("id") Integer id, Model model) {
		model.addAttribute("id",id);
		return "update";
	}
	@RequestMapping("/toAddUser2")
	public String toAddUser2(@RequestParam("id") Integer id, @RequestParam("name") String name, @RequestParam("pwd") String pwd,Model model) {
		userService.add(new User(id, name, pwd));
		List<User> list = userService.queryAllUser();
		model.addAttribute("list", list);
		return "show";
	}
	@RequestMapping("/update2")
	public String update2(@RequestParam("id") Integer id, @RequestParam("name") String name, @RequestParam("pwd") String pwd,Model model) {
		userService.update(new User(id, name, pwd));
		List<User> list = userService.queryAllUser();
		model.addAttribute("list", list);
		return "show";
	}
	@RequestMapping(value = "/delete/{id}")
	public String delete(@PathVariable("id") Integer id,Model model) {
		userService.deleteById(id);
		List<User> list = userService.queryAllUser();
		model.addAttribute("list", list);
		return "show";
	}
	@RequestMapping("/queryUser")
	public String queryUser(@RequestParam("queryUserName") String name,Model model) {
		List<User> list = userService.queryByName(name);
		model.addAttribute("list", list);
		return "detail";
	}
}
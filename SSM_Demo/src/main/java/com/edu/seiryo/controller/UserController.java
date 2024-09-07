package com.edu.seiryo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
		return "allUser";
	}
}

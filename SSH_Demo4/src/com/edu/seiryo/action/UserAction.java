package com.edu.seiryo.action;

import com.edu.seiryo.entity.User;
import com.edu.seiryo.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User>{
	private User user = new User();
	@Override
	public User getModel() {
		return user;
	}
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public String regist() {
		userService.save(user);
		return SUCCESS;
	}
}

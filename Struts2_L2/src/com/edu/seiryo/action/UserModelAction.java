package com.edu.seiryo.action;

import com.edu.seiryo.entity.User;
import com.opensymphony.xwork2.ModelDriven;

public class UserModelAction implements ModelDriven<User>{
	User user = new User();
	public User getModel() {
		return user;
	}
	
	public String test(){
		System.out.println("UserModelAction");
		msg = "";
		String name = user.getUserName();
		String password = user.getUserPassword();
		msg = name + password ;
		return  "success";
	}
	private String msg;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}

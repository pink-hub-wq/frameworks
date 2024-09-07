package com.edu.seiryo.action;

public class UserAction {
	public String execute(){
		System.out.println("UserAction");
		return "success";
	}
	public String query(){
		System.out.println("UserActionQuery");
		return "success";
	}
	public String update(){
		System.out.println("UserActionUpdate");
		return "success";
	}
}

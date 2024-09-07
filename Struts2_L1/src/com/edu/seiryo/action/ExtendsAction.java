package com.edu.seiryo.action;

import com.opensymphony.xwork2.ActionSupport;

public class ExtendsAction extends ActionSupport{
	public String execute() throws Exception {
		System.out.println("ExtendsAction");
		return SUCCESS;
	}
	public String add() throws Exception {
		System.out.println("ExtendsActionAdd");
		return SUCCESS;
	}
	public String update() throws Exception {
		System.out.println("ExtendsActionUpdate");
		return SUCCESS;
	}
}

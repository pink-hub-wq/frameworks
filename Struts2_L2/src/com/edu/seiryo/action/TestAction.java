package com.edu.seiryo.action;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {
	public String execute(){
		System.out.println("TestAction");
		return  SUCCESS;
	}
	public String add(){
		System.out.println("TestActionAdd");
		return  SUCCESS;
	}
}

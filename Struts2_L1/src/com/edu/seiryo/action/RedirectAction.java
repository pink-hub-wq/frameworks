package com.edu.seiryo.action;

import com.opensymphony.xwork2.ActionSupport;

public class RedirectAction extends ActionSupport{
	public String execute(){
		System.out.println("RedirectAction");
		return  SUCCESS;
	}
}

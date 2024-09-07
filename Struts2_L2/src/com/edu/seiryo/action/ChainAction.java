package com.edu.seiryo.action;

import com.opensymphony.xwork2.ActionSupport;

public class ChainAction extends ActionSupport{
	public String execute(){
		System.out.println("ChainAction");
		return SUCCESS;
	}
}

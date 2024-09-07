package com.edu.seiryo.action;

import com.opensymphony.xwork2.Action;

public class InterfaceAction implements Action {

	public String execute() throws Exception {
		System.out.println("InterfaceAction");
		return SUCCESS;
	}
	public String add() throws Exception {
		System.out.println("InterfaceActionAdd");
		return SUCCESS;
	}
	public String update() throws Exception {
		System.out.println("InterfaceActionUpdate");
		return SUCCESS;
	}
}

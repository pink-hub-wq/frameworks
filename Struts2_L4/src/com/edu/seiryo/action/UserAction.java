package com.edu.seiryo.action;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.edu.seiryo.entity.User;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{
	private User user;
	private String msg;
	public String login(){
		System.out.println("UserActionLogin");
		HttpServletRequest request = ServletActionContext.getRequest();
		String resultIndex = "";
		if(("seiryo").equals(user.getUserName()) && ("123").equals(user.getUserPassword())){
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			resultIndex = "teacherMain";
		}else {
			msg = "您的信息有误";
			resultIndex = "error";
		}
		return  resultIndex;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String add(){
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("msg", "add");
		return SUCCESS;
	}
	public String update(){
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("msg", "update");
		return SUCCESS;
	}
	public String delete(){
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("msg", "delete");
		return SUCCESS;
	}
	public String query(){
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("msg", "query");
		return SUCCESS;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}

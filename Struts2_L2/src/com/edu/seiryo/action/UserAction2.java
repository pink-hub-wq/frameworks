package com.edu.seiryo.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;


public class UserAction2 implements ServletRequestAware{

	private HttpServletRequest request;

    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }
    public String login() {
        System.out.println("UserAction2Login");
        String userName = request.getParameter("userName");
        String userPassword = request.getParameter("userPassword");
        msg = "";
		msg = userName + userPassword;
		request.setAttribute("msg", msg);
		return "success";
   }
    private String msg;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}

package com.edu.seiryo.action;

import java.io.IOException;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletResponseAware;

public class UserAction4 implements ServletResponseAware {
	private HttpServletResponse response;
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}
	 public String login() {
	        System.out.println("UserAction3Login");
	        try {
				response.sendRedirect("success2.jsp");
			} catch (IOException e) {
				e.printStackTrace();
			}
			return "success";
	   }
}

package com.edu.seiryo.action;

import javax.servlet.ServletContext;

import org.apache.struts2.util.ServletContextAware;

public class UserAction3 implements ServletContextAware {
	private ServletContext context;
	public void setServletContext(ServletContext context) {
		 this.context = context;
	}
	 public String login() {
	        System.out.println("UserAction3Login");
	        msg = "这是一条测试信息";
	        context.setAttribute("msg", msg);
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

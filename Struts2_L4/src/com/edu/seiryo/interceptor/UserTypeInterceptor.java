package com.edu.seiryo.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.edu.seiryo.entity.User;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class UserTypeInterceptor extends MethodFilterInterceptor{
	private User user;
	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		String username = request.getParameter("user.userName");
		String password = request.getParameter("user.userPassword");
		String type = request.getParameter("userType");
		String resultIndex = "";
		if("教师".equals(type)){
			invocation.invoke();
		}else {
			if(("张三").equals(username) && ("123").equals(password)){
				HttpSession session = request.getSession();
				session.setAttribute("user", new User(username, password));
				resultIndex = "studentMain";
			}else {
				request.setAttribute("msg", "您的信息有误");
				resultIndex = "error";
			}
		}
		return resultIndex;
	}
}

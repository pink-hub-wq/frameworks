package com.edu.seiryo.action;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.edu.seiryo.entity.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport{
	public String execute(){
		System.out.println("UserAction");
		return  SUCCESS;
	}
	public String add(){
		System.out.println("UserActionAdd");
		return  SUCCESS;
	}
	//ͨ��ActionContext��ȡ������
	public String login(){
		System.out.println("UserActionLogin");
		ActionContext context = ActionContext.getContext();
		Map<String, Object> map= context.getParameters();
		Set<String> set = map.keySet();
		msg = "";
		for (String key : set) {
			Object[] objects = (Object[]) map.get(key);
			for (Object object : objects) {
				msg += String.valueOf(object);
			}
		}
		return  SUCCESS;
	}
	//ͨ��ServletActionContext����Ӧ�ľ�̬����ֱ�ӻ�ȡ
	public String login2(){
		System.out.println("UserActionLogin2");
		HttpServletRequest request = ServletActionContext.getRequest();
		String userName = request.getParameter("userName");
		String userPassword = request.getParameter("userPassword");
		msg = "";
		msg = userName + userPassword;
		return  SUCCESS;
	}
	//Struts��������
	public String test(){
		System.out.println("UserActionTest");
		msg="����һ��������Ϣ";
		return  SUCCESS;
	}
	private String msg;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	//Strutsģ������һ
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String test2(){
		System.out.println("UserActionTest");
		msg = "";
		String name = user.getUserName();
		String password = user.getUserPassword();
		msg = name + password ;
		return  SUCCESS;
	}
}

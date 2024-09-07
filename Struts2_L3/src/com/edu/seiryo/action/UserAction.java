package com.edu.seiryo.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.edu.seiryo.entity.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class UserAction extends ActionSupport  {
	private User user;
	private List<User> list;
	private Map<String, User> map;
	public String add(){
		ActionContext context = ActionContext.getContext();
		context.put("msg1", "ActionContext存入数据");
		ValueStack valueStack = context.getValueStack();
		context.put("msg2", "ValueStack存入数据");
		return "success";
	}
	public String query(){
		user = new User("张三", "123");
		return "success";
	}
	public String query2(){
		user = new User(2,"李四", "123");
		return "success";
	}
	public String query3(){
		return "success";
	}
	public String query4(){
		return "success";
	}
	public String query5(){
		return "success";
	}
	public String query6(){
		list = new ArrayList<User>();
		list.add(new User("张三", "123"));
		list.add(new User("李四", "123"));
		list.add(new User("王五", "123"));
		return "success";
	}
	public String query7(){
		map = new HashMap<String, User>();
		map.put("user1", new User(1,"张三", "123"));
		return "success";
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public static String getActionStatic () {
		return "这是action中的静态方法";
	}
	public List<User> getList() {
		return list;
	}
	public void setList(List<User> list) {
		this.list = list;
	}
	public Map<String, User> getMap() {
		return map;
	}
	public void setMap(Map<String, User> map) {
		this.map = map;
	}
	
}

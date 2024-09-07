package com.edu.seiryo.annotation;

import org.springframework.stereotype.Component;

@Component
public class User {
	private int id;
	private String name;
	private String pwd;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public User(int id, String name, String pwd) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		System.out.println("三个参数构造方法");
	}
	public User(String name, String pwd) {
		super();
		this.name = name;
		this.pwd = pwd;
		System.out.println("两个参数构造方法");
	}
	
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("两个参数构造方法");
	}
	public User() {
		System.out.println("无参构造方法");
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", pwd=" + pwd + "]";
	}
	
}

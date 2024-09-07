package com.edu.seiryo.entity;

public class User {
	private Integer id;
	private String name;
	private String pwd;
	private static String staticString = "æ≤Ã¨ Ù–‘";
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	
	public static String getStaticString() {
		return staticString;
	}
	public static void setStaticString(String staticString) {
		User.staticString = staticString;
	}
	public User(Integer id, String name, String pwd) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
	}
	public User(String name, String pwd) {
		super();
		this.name = name;
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", pwd=" + pwd + "]";
	}
	
}

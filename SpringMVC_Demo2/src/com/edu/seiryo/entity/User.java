package com.edu.seiryo.entity;

public class User {
	private Integer id;
	private String name;
	private String pwd;
	private Address address;
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
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public User(Integer id, String name, String pwd) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
	}
	public User() {
		super();
	}
	public User(String name, String pwd) {
		super();
		this.name = name;
		this.pwd = pwd;
	}
	
	public User(Integer id, String name, String pwd, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", pwd=" + pwd + ", address=" + address + "]";
	}
	
}

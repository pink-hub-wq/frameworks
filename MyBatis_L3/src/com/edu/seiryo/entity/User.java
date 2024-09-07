package com.edu.seiryo.entity;

public class User {
	private Integer userId;
	private String userName;
	private String userPwd;
	private String gender;
	public int getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public User(Integer userId, String userName, String userPwd, String gender) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPwd = userPwd;
		this.gender = gender;
	}
	public User() {
		super();
	}
	public User(String userName, String userPwd) {
		super();
		this.userName = userName;
		this.userPwd = userPwd;
	}
	public User(String userName, String userPwd, String gender) {
		super();
		this.userName = userName;
		this.userPwd = userPwd;
		this.gender = gender;
	}
	public User(Integer userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}
	
	public User(Integer userId, String userName, String gender) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.gender = gender;
	}
	
	public User(String userName) {
		super();
		this.userName = userName;
	}
	public User(Integer userId) {
		super();
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPwd=" + userPwd + ", gender=" + gender
				+ "]";
	}
	
}

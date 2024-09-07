package com.edu.seiryo.entity;
/**
 * 日志信息
 * @author WANGQI
 * @date 2024年7月1日
 * @project_name JSP_Jishi_王萁
 * @package_name com.edu.seiryo.entity
 * @file_name Log.java
 * @classname Log
 * @version
 */
public class Log {
	private Integer id;
	private String userName;
	private String loginDtm;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLoginDtm() {
		return loginDtm;
	}
	public void setLoginDtm(String loginDtm) {
		this.loginDtm = loginDtm;
	}
	public Log(Integer id, String userName, String loginDtm) {
		super();
		this.id = id;
		this.userName = userName;
		this.loginDtm = loginDtm;
	}
	public Log(String userName, String loginDtm) {
		super();
		this.userName = userName;
		this.loginDtm = loginDtm;
	}
	
	public Log() {
		super();
	}
	@Override
	public String toString() {
		return "Log [id=" + id + ", userName=" + userName + ", loginDtm=" + loginDtm + "]";
	}
	
}
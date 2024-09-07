package com.edu.seiryo.action;

import java.util.List;

import com.edu.seiryo.entity.User;
import com.edu.seiryo.util.BaseAction;

public class UserAction extends BaseAction<User> {
	public String login() {
		User user = this.getUserServiceImp().login(this.getModel());
		if(user != null) {
			setUrl(query());
		}else {
			setMsg("’À∫≈ªÚ√‹¬Î¥ÌŒÛ£¨«Î…‘∫Û‘Ÿ ‘");
			this.getRequest().put("msg", getMsg());
			setUrl("index");
		}
		return getUrl();
	}
	public String query() {
		List<User> list = this.getUserServiceImp().query();
		this.getRequest().put("list", list);
		setUrl("userslist");
		return getUrl();
	}
	public String reg() {
		try {
			this.getUserServiceImp().add(this.getModel());
			setUrl("index");
		} catch (Exception e) {
			e.printStackTrace();
			setMsg("◊¢≤· ß∞‹£¨«Î…‘∫Û‘Ÿ ‘");
			this.getRequest().put("msg", getMsg());
			setUrl("index");
		}
		return getUrl();
	}
	public String del() {
		try {
			this.getUserServiceImp().delete(this.getModel());
			setUrl(query());
		} catch (Exception e) {
			e.printStackTrace();
			setMsg("…æ≥˝ ß∞‹");
			this.getRequest().put("msg", getMsg());
			setUrl(query());
		}
		return getUrl();
	}
	public String loadUsers() {
		User user = this.getUserServiceImp().queryById(this.getModel().getId());
		this.getRequest().put("users", user);
		setUrl("usersInfo");
		return getUrl();
	}
	public String updUser() {
		this.getUserServiceImp().update(this.getModel());
		setUrl(query());
		return getUrl();
	}
}

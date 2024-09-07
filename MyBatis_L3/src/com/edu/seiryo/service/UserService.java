package com.edu.seiryo.service;

import java.util.List;

import com.edu.seiryo.entity.User;

public interface UserService {
	public int add(User user);
	public int update(User user);
	public int delete(int ids[]);
	public List<User> query(User user);
	public List<User> queryById(int ids[]);
}

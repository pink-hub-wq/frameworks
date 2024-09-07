package com.edu.seiryo.dao;

import java.io.Serializable;
import java.util.List;

import com.edu.seiryo.entity.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	void update(User user);
	List<User> query();
	User queryById(Serializable id);
	User login(User user);
}	

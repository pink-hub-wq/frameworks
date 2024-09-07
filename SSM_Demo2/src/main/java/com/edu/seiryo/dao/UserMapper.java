package com.edu.seiryo.dao;

import java.util.List;

import com.edu.seiryo.entity.User;

public interface UserMapper {
	List<User> queryAllUser();
	void add(User user);
	void update(User user);
	List<User> queryByName(String name);
	void deleteById(Integer id);
}
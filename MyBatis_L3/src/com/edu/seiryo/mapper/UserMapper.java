package com.edu.seiryo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.edu.seiryo.entity.User;

public interface UserMapper {
	public int add(User user);
	public int update(User user);
	public int delete(int ids[]);
	public List<User> query(User user);
	public List<User> queryById(int ids[]);
}

package com.edu.seiryo.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.edu.seiryo.entity.User;

public interface UserMapperService {
	public int add(User user);
	public List<User> query(@Param("order")String order);
	public User queryById(int id);
	public int update(String name,String pwd);
	public int delete(int id);
}

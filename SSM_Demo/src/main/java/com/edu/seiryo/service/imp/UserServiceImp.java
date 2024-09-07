package com.edu.seiryo.service.imp;

import java.util.List;

import com.edu.seiryo.dao.UserMapper;
import com.edu.seiryo.entity.User;
import com.edu.seiryo.service.UserService;

public class UserServiceImp implements UserService{
	UserMapper userMapper;
	
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	public List<User> queryAllUser() {
		return userMapper.queryAllUser();
	}

}

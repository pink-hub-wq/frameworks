package com.edu.seiryo.service.imp;

import java.util.List;

import com.edu.seiryo.dao.UserMapper;
import com.edu.seiryo.dao.imp.UserMapperImp;
import com.edu.seiryo.entity.User;
import com.edu.seiryo.service.UserMapperService;

public class UserMapperServiceImp implements UserMapperService{
	UserMapper userMapper = new UserMapperImp();

	@Override
	public int add(User user) {
		return userMapper.add(user);
	}

	@Override
	public List<User> query(String order) {
		return userMapper.query(order);
	}

	@Override
	public User queryById(int id) {
		return userMapper.queryById(id);
	}

	@Override
	public int update(String name, String pwd) {
		return userMapper.update(name, pwd);
	}

	@Override
	public int delete(int id) {
		return userMapper.delete(id);
	}

}

package com.edu.seiryo.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.seiryo.dao.UserMapper;
import com.edu.seiryo.entity.User;
import com.edu.seiryo.service.UserService;
@Service
public class UserServiceImp implements UserService{
	@Autowired
	UserMapper userMapper;
	
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	public List<User> queryAllUser() {
		return userMapper.queryAllUser();
	}

	public void add(User user) {
		userMapper.add(user);
	}

	public void update(User user) {
		userMapper.update(user);
	}

	public List<User> queryByName(String name){
		return userMapper.queryByName(name);
	}

	public void deleteById(Integer id) {
		userMapper.deleteById(id);
	}

}

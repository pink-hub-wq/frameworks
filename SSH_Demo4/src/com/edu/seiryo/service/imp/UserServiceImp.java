package com.edu.seiryo.service.imp;

import com.edu.seiryo.dao.UserDao;
import com.edu.seiryo.entity.User;
import com.edu.seiryo.service.UserService;

public class UserServiceImp implements UserService{
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	@Override
	public void save(User user) {
		userDao.save(user);
	}
	
}

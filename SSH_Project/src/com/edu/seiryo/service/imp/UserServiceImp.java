package com.edu.seiryo.service.imp;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.seiryo.dao.UserDao;
import com.edu.seiryo.entity.User;
import com.edu.seiryo.service.UserService;
@Service
public class UserServiceImp implements UserService{
	@Autowired
	UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		userDao.add(user);
		
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
		
	}

	@Override
	public void update(User user) {
		userDao.update(user);
	}

	@Override
	public List<User> query() {
		return userDao.query();
	}

	@Override
	public User queryById(Serializable id) {
		return userDao.queryById(id);
	}

	@Override
	public User login(User user) {
		return userDao.login(user);
	}

}

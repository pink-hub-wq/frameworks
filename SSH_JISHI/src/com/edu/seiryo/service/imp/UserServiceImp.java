package com.edu.seiryo.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.seiryo.dao.UserDao;
import com.edu.seiryo.dao.imp.UserDaoImp;
import com.edu.seiryo.entity.UserInfo;
import com.edu.seiryo.service.UserService;
@Service
public class UserServiceImp implements UserService {
	@Autowired
	UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public UserInfo login(UserInfo userInfo) {
		return userDao.login(userInfo);
	}

}

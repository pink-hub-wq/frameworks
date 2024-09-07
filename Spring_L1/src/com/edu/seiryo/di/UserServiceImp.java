package com.edu.seiryo.di;

public class UserServiceImp implements UserService {
	UserDao userDao;
	@Override
	public void add() {
		userDao.add();
	}
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}

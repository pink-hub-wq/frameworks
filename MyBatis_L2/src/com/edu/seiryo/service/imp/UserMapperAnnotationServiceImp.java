package com.edu.seiryo.service.imp;

import java.util.List;

import com.edu.seiryo.dao.UserMapperAnnotation;
import com.edu.seiryo.dao.imp.UserMapperAnnotationImp;
import com.edu.seiryo.entity.User;
import com.edu.seiryo.service.UserMapperAnnotationService;

public class UserMapperAnnotationServiceImp implements UserMapperAnnotationService{
	UserMapperAnnotation userMapperAnnotation = new UserMapperAnnotationImp();
	@Override
	public int add(User user) {
		return userMapperAnnotation.add(user);
	}

	@Override
	public List<User> query(String order) {
		return userMapperAnnotation.query(order);
	}

	@Override
	public User queryById(int id) {
		return userMapperAnnotation.queryById(id);
	}

	@Override
	public int update(String name, String pwd) {
		return userMapperAnnotation.update(name, pwd);
	}

	@Override
	public int delete(int id) {
		return userMapperAnnotation.delete(id);
	}

}

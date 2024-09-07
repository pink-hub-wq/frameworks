package com.edu.seiryo.test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.edu.seiryo.entity.User;
import com.edu.seiryo.service.UserService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class Test {
	@Autowired
	private UserService userService;
	
	@org.junit.Test
	public void save() {
		userService.save(new User("уехЩ", "123"));
	}
}

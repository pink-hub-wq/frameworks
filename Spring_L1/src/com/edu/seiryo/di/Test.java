package com.edu.seiryo.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	User user;
	UserService userService;
	public void query(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/edu/seiryo/di/didemo.xml");
		user = (User)applicationContext.getBean("user");
		System.out.println(user);
	}
	public void add(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/edu/seiryo/di/didemo.xml");
		userService = (UserServiceImp)applicationContext.getBean("UserServiceImp");
		userService.add();
	}
	public static void main(String[] args) {
		Test test = new Test();
		test.query();
		test.add();
	}
}

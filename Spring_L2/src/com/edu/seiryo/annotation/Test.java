package com.edu.seiryo.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public void query(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/edu/seiryo/annotation/annotation.xml");
		User user = (User)applicationContext.getBean("user");
		System.out.println(user);
	}
	public void query2(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/edu/seiryo/annotation/annotation.xml");
		UserService userService = (UserServiceImp)applicationContext.getBean("userServiceImp");
		userService.add();
	}
	public static void main(String[] args) {
		Test test = new Test();
		test.query2();
	}
}

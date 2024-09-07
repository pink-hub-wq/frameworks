package com.edu.seiryo.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public void add(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/edu/seiryo/ioc/iocdemo.xml");
		UserService userService = (UserServiceImp)applicationContext.getBean("UserServiceImp");
		userService.add();
	}
	public static void main(String[] args) {
		Test test = new Test();
		test.add();
	}
}

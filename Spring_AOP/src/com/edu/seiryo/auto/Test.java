package com.edu.seiryo.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		String xmlPath = "com/edu/seiryo/auto/springAop.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		UserService userService = (UserService)applicationContext.getBean("userServiceId");
		userService.addUser();
		userService.updateUser();
		userService.deleteUser();
	}
}

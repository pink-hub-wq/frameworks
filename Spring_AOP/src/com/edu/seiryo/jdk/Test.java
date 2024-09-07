package com.edu.seiryo.jdk;

public class Test {
	public static void main(String[] args) {
		UserService userService = MyBeanFactory.createService();
		userService.addUser();
		userService.updateUser();
		userService.deleteUser();
	}
}

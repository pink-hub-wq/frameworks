package com.edu.seiryo.cglib;

public class Test {
	public static void main(String[] args) {
		UserServiceImp userService = MyBeanFactory.createService();
		userService.addUser();
		userService.updateUser();
		userService.deleteUser();
	}
}

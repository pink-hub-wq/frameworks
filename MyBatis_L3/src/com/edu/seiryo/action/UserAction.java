package com.edu.seiryo.action;

import java.util.ArrayList;
import java.util.List;

import com.edu.seiryo.entity.User;
import com.edu.seiryo.service.UserService;
import com.edu.seiryo.service.imp.UserServiceImp;

public class UserAction {
	public static void main(String[] args) {
		UserService userService = new UserServiceImp();
//		int i = userService.add(new User("����", "123", "��"));
//		int i = userService.update(new User(1,"Сʱ", "456", "��"));
//		int i= userService.delete(new int[]{1});
//		if(i != 0){
//			System.out.println("�ɹ�");
//		}else {
//			System.out.println("ʧ��");
//		}
//		List<User> list = new ArrayList<User>();
//		User user1 = new User();
//		user1.setUserName("����");
//		list = userService.query(new User());
		List<User> list = userService.queryById(new int[]{2,3});
		for (User user : list) {
			System.out.println(user);
		}
	}
}

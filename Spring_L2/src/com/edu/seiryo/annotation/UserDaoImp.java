package com.edu.seiryo.annotation;

import org.springframework.stereotype.Component;

@Component("userdaouserdao")
public class UserDaoImp implements UserDao {

	@Override
	public void add() {
		System.out.println("query2");
	}

}

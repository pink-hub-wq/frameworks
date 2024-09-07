package com.edu.seiryo;

public class UserServiceImpl {
	public User toUppeCase(User user){
        user.setName(user.getName().toUpperCase());
        return user;
    }
}

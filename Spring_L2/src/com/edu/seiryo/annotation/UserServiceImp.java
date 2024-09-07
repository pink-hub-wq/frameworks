package com.edu.seiryo.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImp implements UserService {
	@Autowired
	@Qualifier("userdaouserdao")
	UserDao userdao;
	@Override
	public void add() {
		userdao.add();
	}
	public UserDao getUserdao() {
		return userdao;
	}
	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}
	
}

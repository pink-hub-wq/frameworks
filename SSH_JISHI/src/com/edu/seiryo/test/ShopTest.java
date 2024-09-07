package com.edu.seiryo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.edu.seiryo.service.ShopInfoService;
import com.edu.seiryo.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class ShopTest {
	@Autowired
	ShopInfoService shopInfoService;
	
	@Test
	public void add() {
		shopInfoService.query();
	}
}


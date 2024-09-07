package com.edu.seiryo.p;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public void query1(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/edu/seiryo/p/p.xml");
		User user = (User) applicationContext.getBean("user");
		System.out.println(user);
	}
	public void query2(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/edu/seiryo/p/p.xml");
		User user = (User) applicationContext.getBean("user2");
		System.out.println(user);
	}
	public void query3(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/edu/seiryo/p/p.xml");
		User user = (User) applicationContext.getBean("user3");
		System.out.println(user);
	}
	public void query4(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/edu/seiryo/p/p.xml");
		User user = (User) applicationContext.getBean("user4");
		System.out.println(user);
	}
	public static void main(String[] args) {
		Test test = new Test();
		test.query4();
	}
}

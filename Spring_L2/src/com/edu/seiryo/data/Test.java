package com.edu.seiryo.data;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public void query(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/edu/seiryo/data/data.xml");
		Data data = (Data)applicationContext.getBean("data");
		System.out.println(data);
	}
	public static void main(String[] args) {
		Test test = new Test();
		test.query();
	}
}

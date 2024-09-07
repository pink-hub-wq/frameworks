package com.edu.seiryo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.edu.seiryo.pojo.Dog;
import com.edu.seiryo.pojo.Person;

@SpringBootTest
class Demo2ApplicationTests {
	
	@Autowired
	Dog dog;
	
	@Autowired
	Person person;
	
    @Test
    void contextLoads() {
    	System.out.println(dog);
    	System.out.println(person);
    }

}

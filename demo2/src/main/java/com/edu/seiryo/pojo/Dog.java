package com.edu.seiryo.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Dog {
	@Value("小飞机")
	private String name;
	@Value("20")
	private Integer age;
	
}

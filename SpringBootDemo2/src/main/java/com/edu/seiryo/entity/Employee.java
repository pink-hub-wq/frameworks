package com.edu.seiryo.entity;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Employee {
	private Integer id;
	private String lastName;
	private String email;
	private Integer gender;
	private Integer department;
	private Date birth;
	private Department eDepartment; 
	
}

package com.edu.seiryo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User2 {
	private Long id;
	private String name;
	private int age;
	private String address;
}

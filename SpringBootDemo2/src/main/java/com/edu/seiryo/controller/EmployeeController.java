package com.edu.seiryo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.edu.seiryo.entity.Employee;
import com.edu.seiryo.mapper.EmployeeMapper;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeMapper employeeMapper;

	@GetMapping("/getEmployees")
	public List<Employee> getEmployees() {
		return employeeMapper.getEmployees();
	}

	@GetMapping("/save")
	public int save() {
		Employee employee = new Employee();
		employee.setLastName("kuangshen");
		employee.setEmail("qinjiang@qq.com");
		employee.setGender(1);
		employee.setDepartment(101);
		employee.setBirth(new Date());
		return employeeMapper.save(employee);
	}

	@GetMapping("/get/{id}")
	public Employee get(@PathVariable("id") Integer id) {
		return employeeMapper.get(id);
	}

	@GetMapping("/delete/{id}")
	public int delete(@PathVariable("id") Integer id) {
		return employeeMapper.delete(id);
	}
}

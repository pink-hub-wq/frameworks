package com.edu.seiryo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.edu.seiryo.entity.Department;
import com.edu.seiryo.mapper.DepartmentMapper;

@RestController
public class DepartmentController {
	@Autowired
	DepartmentMapper departmentMapper;

	@GetMapping("/getDepartments")
	public List<Department> getDepartments() {
		return departmentMapper.getDepartments();
	}
	@GetMapping("/getDepartment/{id}")
	public Department getDepartment(@PathVariable("id") Integer id){
		return departmentMapper.getDepartment(id);
	}
}

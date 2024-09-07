package com.edu.seiryo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.seiryo.entity.Department;
import com.edu.seiryo.entity.Employee;
import com.edu.seiryo.mapper.DepartmentMapper;
import com.edu.seiryo.mapper.EmployeeMapper;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeMapper employeeMapper;
	
	@Autowired
	DepartmentMapper departmentMapper;
	
	@GetMapping("/emps")
	public String getList(Model model) {
		List<Employee> list = employeeMapper.getEmployees();
		model.addAttribute("emps",list);
		return "emp/list";
	}
	@GetMapping("/emp")
	public String toAddPage(Model model) {
		List<Department> list = departmentMapper.getDepartments();
		model.addAttribute("departments",list);
		return "emp/add";
	}
	@PostMapping("/emp")
	public String addEmp(Employee employee) {
		employeeMapper.save(employee);
		return "redirect:/emps";
	}
	@DeleteMapping("/emp/{id}")
	public String deleteEmp(@PathVariable("id") Integer id) {
		employeeMapper.delete(id);
		return "redirect:/emps";
	}
	@GetMapping("/emp/{id}")
	public String toUpdateEmp(@PathVariable("id") Integer id,Model model) {
		Employee employee = employeeMapper.get(id);
		model.addAttribute("emp",employee);
		List<Department> list = departmentMapper.getDepartments();
		model.addAttribute("departments",list);
		return "emp/update";
	}
	@PutMapping("/emp")
	public String updateEmp(Employee employee) {
		employeeMapper.update(employee);
		return "emp/update";
	}
}

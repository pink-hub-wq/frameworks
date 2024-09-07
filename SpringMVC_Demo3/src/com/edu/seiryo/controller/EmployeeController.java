package com.edu.seiryo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.edu.seiryo.dao.DepartmentDao;
import com.edu.seiryo.dao.EmployeeDao;
import com.edu.seiryo.entity.Employee;
import com.sun.org.apache.bcel.internal.generic.NEW;

@Controller
@RequestMapping("EmployeeController")
public class EmployeeController {
	@Autowired
	EmployeeDao employeeDao;
	
	@Autowired
	DepartmentDao departmentDao;
	
	//查询所有
	@RequestMapping(value = "/emps")
	public String queryAll(Model model) {
		model.addAttribute("emps", employeeDao.getAll());
		return "query";
	}
	
	@RequestMapping(value = "/emp",method = RequestMethod.GET)
	public String add(Model model) {
		model.addAttribute("employee", new Employee());
		model.addAttribute("departments",departmentDao.getDepartments());
		return "input";
	}
	//查询单个
	@RequestMapping(value = "/emp/{id}",method = RequestMethod.GET)
	public String queryById(Model model,@PathVariable("id")Integer id) {
		model.addAttribute("employee", employeeDao.get(id));
		model.addAttribute("departments", departmentDao.getDepartments());
		return "input";
	}
	//新增
	@RequestMapping(value = "/emp",method = RequestMethod.POST)
	public String add(Employee employee) {
		employeeDao.save(employee);
		return "redirect:/EmployeeController/emps";
	}
	//删除
	@RequestMapping(value = "/emp/{id}",method = RequestMethod.DELETE)
	public String delete(@PathVariable("id")Integer id) {
		employeeDao.delete(id);
		return "redirect:/EmployeeController/emps";
	}
	//修改
	@RequestMapping(value = "/emp",method = RequestMethod.PUT)
	public String update(Employee employee) {
		employeeDao.save(employee);
		return "redirect:/EmployeeController/emps";
	}
}

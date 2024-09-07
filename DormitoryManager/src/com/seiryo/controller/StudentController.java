package com.seiryo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.seiryo.po.PageInfo;
import com.seiryo.po.Student;
import com.seiryo.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/findStudent")
	public String findStudent(String s_name, Integer s_studentid, Integer s_classid, String s_classname,
			Integer pageIndex, Integer pageSize, Model model) {

		PageInfo<Student> pageInfo = studentService.findPageInfo(s_name, s_studentid, s_classid, s_classname, pageIndex,
				pageSize);
		model.addAttribute("pi", pageInfo);
		model.addAttribute("s_name", s_name);
		model.addAttribute("s_studentid", s_studentid);
		model.addAttribute("s_classid", s_classid);
		model.addAttribute("s_classname", s_classname);
		return "student_list";
	}

	@RequestMapping(value = "/exportstudentlist", method = RequestMethod.POST)
	@ResponseBody
	public List<Student> exportStudent() {
		List<Student> list = studentService.getAll();
		return list;
	}

	@RequestMapping("/deleteStudent")
	@ResponseBody
	public String deleteStudent(Integer s_id) {
		studentService.deleteStudent(s_id);
		return "student_list";
	}

	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	@ResponseBody
	public String addStudent(@RequestBody Student student) {
		studentService.addStudent(student);
		return "student_list";
	}

	@RequestMapping(value = "/updateStudent", method = RequestMethod.POST)
	public String updateStudent(Student student) {
		studentService.updateStudent(student);
		return "redirect:/findStudent";
	}

	@RequestMapping("/findStudentById")
	public String findStudentById(Integer s_id, HttpSession session) {
		Student student = studentService.findStudentById(s_id);
		session.setAttribute("s", student);
		return "student_edit";
	}
}

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
import com.seiryo.service.ClassService;

@Controller
public class ClassController {
	@Autowired
	private ClassService classService;

	@RequestMapping(value = "/findClass")
	public String findClass(Integer c_classid, String c_classname, String c_counsellor, Integer pageIndex,
			Integer pageSize, Model model) {

		PageInfo<com.seiryo.po.Class> pageInfo = classService.findPageInfo(c_classname, c_counsellor, c_classid, pageIndex,
				pageSize);
		model.addAttribute("ci", pageInfo);
		model.addAttribute("c_classname", c_classname);
		model.addAttribute("c_counsellor", c_counsellor);
		model.addAttribute("c_classid", c_classid);
		return "class_list";
	}

	@RequestMapping(value = "/exportclasslist", method = RequestMethod.POST)
	@ResponseBody
	public List<com.seiryo.po.Class> exportClass() {
		List<com.seiryo.po.Class> list = classService.getAll();
		return list;
	}

	@RequestMapping(value = "/addClass", method = RequestMethod.POST)
	@ResponseBody
	public String addClass(@RequestBody com.seiryo.po.Class class1) {
		classService.addClass(class1);
		return "class_list";
	}

	@RequestMapping("/deleteClass")
	@ResponseBody
	public String deleteClass(Integer c_id) {
		classService.deleteClass(c_id);
		return "class_list";
	}

	@RequestMapping(value = "/updateClass", method = RequestMethod.POST)
	public String updateClass(com.seiryo.po.Class class1) {
		int c = classService.updateClass(class1);
		return "redirect:/findClass";
	}

	@RequestMapping("/findClassById")
	public String findClassById(Integer c_id, HttpSession session) {
		com.seiryo.po.Class class1 = classService.findClassById(c_id);
		session.setAttribute("c", class1);
		return "class_edit";
	}

	@RequestMapping(value = "/findClassStudent")
	public String findClassStudent(com.seiryo.po.Class class1, String c_classid, String c_classname, Model model) {
		List<com.seiryo.po.Class> list = classService.findClassStudent(class1);
		model.addAttribute("cs", list);
		model.addAttribute("c_classname", c_classname);
		model.addAttribute("c_classid", c_classid);
		return "class_Studentlist";
	}
}

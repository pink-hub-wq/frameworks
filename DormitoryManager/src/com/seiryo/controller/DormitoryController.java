package com.seiryo.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.seiryo.po.Dormitory;
import com.seiryo.po.PageInfo;
import com.seiryo.service.DormitoryService;

@Controller
public class DormitoryController {
	@Autowired
	private DormitoryService dormitoryService;

	@RequestMapping(value = "/findDormitory")
	public String findDormitory(String a_name, Integer s_dormitoryid, String d_dormbuilding, Integer pageIndex,
			Integer pageSize, Model model) {

		PageInfo<Dormitory> pageInfo = dormitoryService.findPageInfo(a_name, s_dormitoryid, d_dormbuilding, pageIndex,
				pageSize);
		model.addAttribute("di", pageInfo);
		model.addAttribute("a_name", a_name);
		model.addAttribute("s_dormitoryid", s_dormitoryid);
		model.addAttribute("d_dormbuilding", d_dormbuilding);
		return "dormitory_list";
	}

	@RequestMapping(value = "/exportdormitorylist", method = RequestMethod.POST)
	@ResponseBody
	public List<Dormitory> exportDormitory() {
		List<Dormitory> list = dormitoryService.getAll();
		return list;
	}

	@RequestMapping(value = "/addDormitory", method = RequestMethod.POST)
	@ResponseBody
	public String addDormitory(@RequestBody Dormitory dormitory) {
		dormitoryService.addDormitory(dormitory);
		return "dormitory_list";
	}

	@RequestMapping("/deleteDormitory")
	@ResponseBody
	public String deleteDormitory(Integer d_id) {
		dormitoryService.deleteDormitory(d_id);
		return "dormitory_list";
	}

	@RequestMapping("/updateDormitory")
	public String updateDormitory(Dormitory dormitory) {
		dormitoryService.updateDormitory(dormitory);
		return "redirect:/findDormitory";
	}

	@RequestMapping("/findDormitoryById")
	public String findDormitoryById(Integer d_id, HttpSession session) {
		Dormitory dormitory = dormitoryService.findDormitoryById(d_id);
		System.out.println(dormitory);
		session.setAttribute("d", dormitory);
		return "dormitory_edit";
	}

	@RequestMapping(value = "/findDormitoryStudent2")
	public String findDormitoryStudent2(Model model) {
		List<Dormitory> list = dormitoryService.getAll();
		List<Dormitory> newList = new ArrayList<Dormitory>();
		Set<Integer> dormitoryIds = new HashSet<>();
		for (Dormitory dormitory : list) {
			dormitoryIds.add(dormitory.getS_dormitoryid());
		}
		for (Dormitory dormitory : list) {
			if (dormitoryIds.contains(dormitory.getS_dormitoryid())) {
				List<Dormitory> dormWithStudents = dormitoryService.findDormitoryStudent(dormitory);
				newList.addAll(dormWithStudents);
			}
		}
		System.out.println(newList);
		model.addAttribute("ds", newList);
		return "dormitory_Studentlist";
	}

	@RequestMapping(value = "/findDormitoryStudent")
	public String findDormitoryStudent(Dormitory dormitory, Model model) {
		List<Dormitory> list = dormitoryService.findDormitoryStudent(dormitory);
		model.addAttribute("ds", list);
		model.addAttribute("s_dormitoryid", dormitory.getS_dormitoryid());
		return "dormitory_Studentlist";
	}
}

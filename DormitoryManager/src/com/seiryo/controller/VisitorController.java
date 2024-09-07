package com.seiryo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.seiryo.po.PageInfo;
import com.seiryo.po.Visitor;
import com.seiryo.service.VisitorService;

@Controller
public class VisitorController {
	@Autowired
	private VisitorService visitorService;

	@RequestMapping(value = "/findVisitor")
	public String findVisitor(String v_name, Integer v_phone, Integer pageIndex, Integer pageSize, Model model) {

		PageInfo<Visitor> pageInfo = visitorService.findPageInfo(v_name, v_phone, pageIndex, pageSize);
		model.addAttribute("pi", pageInfo);
		model.addAttribute("v_name", v_name);
		model.addAttribute("v_phone", v_phone);
		return "visitor_list";
	}

	@RequestMapping(value = "/exportvisitorlist", method = RequestMethod.POST)
	@ResponseBody
	public List<Visitor> exportVisitor() {
		List<Visitor> list = visitorService.getAll();
		return list;
	}

	@RequestMapping(value = "/addVisitor", method = RequestMethod.POST)
	@ResponseBody
	public String addStudent(@RequestBody Visitor visitor) {
		visitorService.addVisitor(visitor);
		return "visitor_list";
	}
}

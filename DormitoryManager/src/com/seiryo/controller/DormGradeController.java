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

import com.seiryo.po.DormGrade;
import com.seiryo.po.PageInfo;
import com.seiryo.service.DormGradeService;

@Controller
public class DormGradeController {
	@Autowired
	private DormGradeService dormGradeService;

	@RequestMapping(value = "/findDormClean")
	public String findDormGrade(Integer d_id, String d_dormbuilding, Integer pageIndex, Integer pageSize, Model model) {
		PageInfo<DormGrade> pageInfo = dormGradeService.findPageInfo(d_id, d_dormbuilding, pageIndex, pageSize);
		model.addAttribute("di", pageInfo);
		model.addAttribute("d_id", d_id);
		model.addAttribute("d_dormbuilding", d_dormbuilding);
		return "dormclean_list";
	}

	@RequestMapping(value = "/exportdormcleanlist", method = RequestMethod.POST)
	@ResponseBody
	public List<DormGrade> exportDormclean() {
		List<DormGrade> list = dormGradeService.getAll();
		return list;
	}

	@RequestMapping(value = "/addDormClean", method = RequestMethod.POST)
	@ResponseBody
	public String addDormClean(@RequestBody DormGrade dormclean) {
		dormGradeService.addDormGrade(dormclean);
		return "dormclean_list";
	}

	@RequestMapping("/deleteDormClean")
	@ResponseBody
	public String deleteDormClean(Integer g_id) {
		dormGradeService.deleteDormGrade(g_id);
		return "dormclean_list";
	}

	@RequestMapping("/updateDormClean")
	public String updateDormClean(DormGrade dormGrade) {
		dormGradeService.updateDormGrade(dormGrade);
		return "redirect:/findDormClean";
	}

	@RequestMapping("/findDormCleanById")
	public String findDormCleanById(Integer g_id, HttpSession session) {
		DormGrade dormGrade = dormGradeService.findDormGradeById(g_id);
		session.setAttribute("d", dormGrade);
		return "dormclean_edit";
	}
}

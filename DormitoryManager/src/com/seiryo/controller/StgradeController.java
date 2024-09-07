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
import com.seiryo.po.Stgrade;
import com.seiryo.service.StgradeService;

@Controller
public class StgradeController {
	@Autowired
	private StgradeService stgradeService;

	@RequestMapping(value = "/findStudentClean")
	public String findStgrade(Integer s_studentid, String s_name, Integer s_dormitoryid, Integer pageIndex,
			Integer pageSize, Model model) {
		PageInfo<Stgrade> pageInfo = stgradeService.findPageInfo(s_studentid, s_name, s_dormitoryid, pageIndex, pageSize);
		model.addAttribute("di", pageInfo);
		model.addAttribute("s_studentid", s_studentid);
		model.addAttribute("s_name", s_name);
		model.addAttribute("s_dormitoryid", s_dormitoryid);
		return "studentclean_list";
	}

	@RequestMapping(value = "/exportstudentcleanlist", method = RequestMethod.POST)
	@ResponseBody
	public List<Stgrade> exportStgrade() {
		List<Stgrade> list = stgradeService.getAll();
		return list;
	}

	@RequestMapping(value = "/addStudentClean", method = RequestMethod.POST)
	@ResponseBody
	public String addStgrade(@RequestBody Stgrade stgrade) {
		stgradeService.addStgrade(stgrade);
		return "studentclean_list";
	}

	@RequestMapping("/deleteStudentClean")
	@ResponseBody
	public String deleteStgrade(Integer g_id) {
		stgradeService.deleteStgrade(g_id);
		return "studentclean_list";
	}

	@RequestMapping("/updateStudentClean")
	public String updateStgrade(Stgrade stgrade) {
		stgradeService.updateStgrade(stgrade);
		return "redirect:/findStudentClean";
	}

	@RequestMapping("/findStudentCleanById")
	public String findStgradeById(Integer g_id, HttpSession session) {
		Stgrade stgrade = stgradeService.findStgradeById(g_id);
		session.setAttribute("d", stgrade);
		return "studentclean_edit";
	}
}

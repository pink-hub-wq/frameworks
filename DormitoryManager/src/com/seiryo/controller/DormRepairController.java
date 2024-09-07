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

import com.seiryo.po.DormRepair;
import com.seiryo.po.PageInfo;
import com.seiryo.service.DormRepairService;

@Controller
public class DormRepairController {
	@Autowired
	private DormRepairService dormRepairService;

	@RequestMapping(value = "/findDormRepair")
	public String findDormRepair(Integer d_id, String d_dormbuilding, Integer pageIndex, Integer pageSize,
			Model model) {

		PageInfo<DormRepair> pageInfo = dormRepairService.findPageInfo(d_id, d_dormbuilding, pageIndex, pageSize);
		model.addAttribute("di", pageInfo);
		model.addAttribute("d_id", d_id);
		model.addAttribute("d_dormbuilding", d_dormbuilding);
		return "dormrepair_list";
	}

	@RequestMapping(value = "/exportdormrepairlist", method = RequestMethod.POST)
	@ResponseBody
	public List<DormRepair> exportDormrepair() {
		List<DormRepair> list = dormRepairService.getAll();
		return list;
	}

	@RequestMapping(value = "/addDormRepair", method = RequestMethod.POST)
	@ResponseBody
	public String addDormitory(@RequestBody DormRepair dormrepair) {
		dormRepairService.addDormRepair(dormrepair);
		return "dormrepair_list";
	}

	@RequestMapping("/deleteDormRepair")
	@ResponseBody
	public String deleteDormRepair(Integer r_id) {
		dormRepairService.deleteDormRepair(r_id);
		return "dormrepair_list";
	}

	@RequestMapping("/updateDormRepair")
	public String updateDormRepair(DormRepair dormrepair) {
		dormRepairService.updateDormRepair(dormrepair);
		return "redirect:/findDormRepair";
	}

	@RequestMapping("/findDormRepairById")
	public String findDormRepairById(Integer r_id, HttpSession session) {
		DormRepair dormRepair = dormRepairService.findDormRepairById(r_id);
		session.setAttribute("d", dormRepair);
		return "dormrepair_edit";
	}
}

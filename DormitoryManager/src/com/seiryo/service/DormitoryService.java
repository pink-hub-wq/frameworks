package com.seiryo.service;

import java.util.List;

import com.seiryo.po.Class;
import com.seiryo.po.Dormitory;
import com.seiryo.po.PageInfo;

public interface DormitoryService {
	// 分页查询
	public PageInfo<Dormitory> findPageInfo(String a_name, Integer s_dormitoryid, String d_dormbuilding,
			Integer pageIndex, Integer pageSize);

	// 添加
	public int addDormitory(Dormitory dormitory);

	// 删除
	public int deleteDormitory(Integer d_id);

	// 修改
	public int updateDormitory(Dormitory dormitory);

	public Dormitory findDormitoryById(Integer d_id);

	public List<Dormitory> findDormitoryStudent(Dormitory dormitory);

	public List<Dormitory> getAll();
}

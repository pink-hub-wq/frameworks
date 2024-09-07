package com.seiryo.service;

import java.util.List;

import com.seiryo.po.PageInfo;
import com.seiryo.po.Stgrade;

public interface StgradeService {
	// 分页查询
	public PageInfo<Stgrade> findPageInfo(Integer s_studentid, String s_name, Integer s_dormitoryid, Integer pageIndex,
			Integer pageSize);

	public int addStgrade(Stgrade stgrade);

	public int deleteStgrade(Integer g_id);

	public int updateStgrade(Stgrade stgrade);

	public Stgrade findStgradeById(Integer g_id);

	public List<Stgrade> getAll();
}

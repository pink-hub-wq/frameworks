package com.seiryo.service;

import java.util.List;

import com.seiryo.po.DormGrade;
import com.seiryo.po.PageInfo;

public interface DormGradeService {
	public PageInfo<DormGrade> findPageInfo(Integer d_id, String d_dormbuilding, Integer pageIndex, Integer pageSize);

	public int addDormGrade(DormGrade dormGrade);

	public int deleteDormGrade(Integer g_id);

	public int updateDormGrade(DormGrade dormGrade);

	public DormGrade findDormGradeById(Integer g_id);

	public List<DormGrade> getAll();
}

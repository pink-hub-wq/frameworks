package com.seiryo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.seiryo.po.DormGrade;

public interface DormGradeDao {
	/**
	 * 进行分页查询
	 */
	// 获取总条数
	public Integer totalCount(@Param("d_id") Integer d_id, @Param("d_dormbuilding") String d_dormbuilding);

	// 获取用户列表
	public List<DormGrade> getDormGradeList(@Param("d_id") Integer d_id, @Param("d_dormbuilding") String d_dormbuilding,
			@Param("currentPage") Integer currentPage, @Param("pageSize") Integer pageSize);

	public int addDormGrade(DormGrade dormGrade);

	public int deleteDormGrade(Integer g_id);

	public int updateDormGrade(DormGrade dormGrade);

	public DormGrade findDormGradeById(Integer g_id);

	public List<DormGrade> getAll();
}

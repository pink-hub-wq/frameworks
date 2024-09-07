package com.seiryo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.seiryo.po.Dormitory;

public interface DormitoryDao {
	/**
	 * 进行分页查询
	 */

	// 获取总条数
	public Integer totalCount(@Param("a_name") String a_name, @Param("s_dormitoryid") Integer s_dormitoryid,
			@Param("d_dormbuilding") String d_dormbuilding);

	// 获取用户列表
	public List<Dormitory> getDormitoryList(@Param("a_name") String a_name,
			@Param("s_dormitoryid") Integer s_dormitoryid, @Param("d_dormbuilding") String d_dormbuilding,
			@Param("currentPage") Integer currentPage, @Param("pageSize") Integer pageSize);

	// 添加
	public int addDormitory(Dormitory dormitory);

	// 刪除
	public int deleteDormitory(Integer d_id);

	// 修改
	public int updateDormitory(Dormitory dormitory);

	public Dormitory findDormitoryById(Integer d_id);

	public List<Dormitory> findDormitoryStudent(Dormitory dormitory);

	public List<Dormitory> getAll();
}

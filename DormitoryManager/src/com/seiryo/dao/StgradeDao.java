package com.seiryo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.seiryo.po.Stgrade;

public interface StgradeDao {
	/**
	 * 进行分页查询
	 */
	// 获取总条数
	public Integer totalCount(@Param("s_studentid") Integer s_studentid, @Param("s_name") String s_name,
			@Param("s_dormitoryid") Integer s_dormitoryid);

	// 获取用户列表
	public List<Stgrade> getStgradeList(@Param("s_studentid") Integer s_studentid, @Param("s_name") String s_name,
			@Param("s_dormitoryid") Integer s_dormitoryid, @Param("currentPage") Integer currentPage,
			@Param("pageSize") Integer pageSize);

	public int addStgrade(Stgrade stgrade);

	public int deleteStgrade(Integer g_id);

	public int updateStgrade(Stgrade stgrade);

	public Stgrade findStgradeById(Integer g_id);

	public List<Stgrade> getAll();
}

package com.seiryo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.seiryo.po.Visitor;

public interface VisitorDao {
	/**
	 * 进行分页查询
	 */

	// 获取总条数
	public Integer totalCount(@Param("v_name") String v_name, @Param("v_phone") Integer v_phone);

	// 获取用户列表
	public List<Visitor> getVisitorList(@Param("v_name") String v_name, @Param("v_phone") Integer v_phone,
			@Param("currentPage") Integer currentPage, @Param("pageSize") Integer pageSize);

	// 添加
	public int addVisitor(Visitor visitor);

	public List<Visitor> getAll();
}

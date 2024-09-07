package com.seiryo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.seiryo.po.DormRepair;

public interface DormRepairDao {
	/**
	 * 进行分页查询
	 */

	// 获取总条数
	public Integer totalCount(@Param("d_id") Integer d_id, @Param("d_dormbuilding") String d_dormbuilding);

	// 获取用户列表
	public List<DormRepair> getDormRepairList(@Param("d_id") Integer d_id,
			@Param("d_dormbuilding") String d_dormbuilding, @Param("currentPage") Integer currentPage,
			@Param("pageSize") Integer pageSize);

	public int addDormRepair(DormRepair dormrepair);

	public int deleteDormRepair(Integer r_id);

	public int updateDormRepair(DormRepair dormrepair);

	public DormRepair findDormRepairById(Integer r_id);

	public List<DormRepair> getAll();

}

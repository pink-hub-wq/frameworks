package com.seiryo.service;

import java.util.List;

import com.seiryo.po.DormRepair;
import com.seiryo.po.PageInfo;

public interface DormRepairService {
	public PageInfo<DormRepair> findPageInfo(Integer d_id, String d_dormbuilding, Integer pageIndex, Integer pageSize);

	public int addDormRepair(DormRepair dormrepair);

	public int deleteDormRepair(Integer r_id);

	public int updateDormRepair(DormRepair dormrepair);

	public DormRepair findDormRepairById(Integer r_id);

	public List<DormRepair> getAll();
}

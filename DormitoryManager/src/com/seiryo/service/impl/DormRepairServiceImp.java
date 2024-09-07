package com.seiryo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.seiryo.dao.DormRepairDao;
import com.seiryo.po.DormRepair;
import com.seiryo.po.PageInfo;
import com.seiryo.service.DormRepairService;

@Service("dormRepairService")
@Transactional
public class DormRepairServiceImp implements DormRepairService {
	@Autowired
	private DormRepairDao dormRepairDao;

	@Override
	public PageInfo<DormRepair> findPageInfo(Integer d_id, String d_dormbuilding, Integer pageIndex, Integer pageSize) {
		PageInfo<DormRepair> pi = new PageInfo<DormRepair>();
		pi.setPageIndex(pageIndex);
		pi.setPageSize(pageSize);
		// 获取总条数
		Integer totalCount = dormRepairDao.totalCount(d_id, d_dormbuilding);
		if (totalCount > 0) {
			pi.setTotalCount(totalCount);
			List<DormRepair> dormRepairList = dormRepairDao.getDormRepairList(d_id, d_dormbuilding,
					(pi.getPageIndex() - 1) * pi.getPageSize(), pi.getPageIndex() * pi.getPageSize());
			pi.setList(dormRepairList);
		}
		return pi;
	}

	@Override
	public int addDormRepair(DormRepair dormrepair) {
		return dormRepairDao.addDormRepair(dormrepair);
	}

	@Override
	public int deleteDormRepair(Integer r_id) {
		return dormRepairDao.deleteDormRepair(r_id);
	}

	@Override
	public int updateDormRepair(DormRepair dormrepair) {
		return dormRepairDao.updateDormRepair(dormrepair);
	}

	@Override
	public DormRepair findDormRepairById(Integer r_id) {
		DormRepair dormRepair = dormRepairDao.findDormRepairById(r_id);
		return dormRepair;
	}

	@Override
	public List<DormRepair> getAll() {
		List<DormRepair> list = dormRepairDao.getAll();
		return list;
	}

}

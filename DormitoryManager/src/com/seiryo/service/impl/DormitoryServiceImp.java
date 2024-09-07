package com.seiryo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.seiryo.dao.DormitoryDao;
import com.seiryo.po.Class;
import com.seiryo.po.Dormitory;
import com.seiryo.po.PageInfo;
import com.seiryo.service.DormitoryService;

@Service("dormitoryService")
@Transactional
public class DormitoryServiceImp implements DormitoryService {

	@Autowired
	private DormitoryDao dormitoryDao;

	@Override
	public PageInfo<Dormitory> findPageInfo(String a_name, Integer s_dormitoryid, String d_dormbuilding,
			Integer pageIndex, Integer pageSize) {
		PageInfo<Dormitory> pi = new PageInfo<Dormitory>();
		pi.setPageIndex(pageIndex);
		pi.setPageSize(pageSize);
		// 获取总条数
		Integer totalCount = dormitoryDao.totalCount(a_name, s_dormitoryid, d_dormbuilding);
		if (totalCount > 0) {
			pi.setTotalCount(totalCount);
			List<Dormitory> dormitoryList = dormitoryDao.getDormitoryList(a_name, s_dormitoryid, d_dormbuilding,
					(pi.getPageIndex() - 1) * pi.getPageSize(), pi.getPageIndex() * pi.getPageSize());
			pi.setList(dormitoryList);
		}
		return pi;
	}

	@Override
	public int addDormitory(Dormitory dormitory) {
		return dormitoryDao.addDormitory(dormitory);
	}

	@Override
	public int deleteDormitory(Integer d_id) {
		return dormitoryDao.deleteDormitory(d_id);
	}

	@Override
	public int updateDormitory(Dormitory dormitory) {
		return dormitoryDao.updateDormitory(dormitory);
	}

	@Override
	public Dormitory findDormitoryById(Integer d_id) {
		System.out.println("d_id:" + d_id);
		Dormitory dormitory = dormitoryDao.findDormitoryById(d_id);
		return dormitory;
	}

	@Override
	public List<Dormitory> findDormitoryStudent(Dormitory dormitory) {
		List<Dormitory> list = dormitoryDao.findDormitoryStudent(dormitory);
		return list;
	}

	@Override
	public List<Dormitory> getAll() {
		List<Dormitory> list = dormitoryDao.getAll();
		return list;
	}

}

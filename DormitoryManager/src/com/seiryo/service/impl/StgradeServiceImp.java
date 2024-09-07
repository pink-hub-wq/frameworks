package com.seiryo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.seiryo.dao.StgradeDao;
import com.seiryo.po.PageInfo;
import com.seiryo.po.Stgrade;
import com.seiryo.service.StgradeService;

@Service("StgradeService")
@Transactional
public class StgradeServiceImp implements StgradeService {

	@Autowired
	private StgradeDao stgradeDao;

	@Override
	public PageInfo<Stgrade> findPageInfo(Integer s_studentid, String s_name, Integer s_dormitoryid, Integer pageIndex,
			Integer pageSize) {
		PageInfo<Stgrade> pi = new PageInfo<Stgrade>();
		pi.setPageIndex(pageIndex);
		pi.setPageSize(pageSize);
		// 获取总条数
		Integer totalCount = stgradeDao.totalCount(s_studentid, s_name, s_dormitoryid);
		if (totalCount > 0) {
			pi.setTotalCount(totalCount);
			List<Stgrade> list = stgradeDao.getStgradeList(s_studentid, s_name, s_dormitoryid,
					(pi.getPageIndex() - 1) * pi.getPageSize(), pi.getPageIndex() * pi.getPageSize());
			pi.setList(list);
		}
		return pi;
	}

	@Override
	public int addStgrade(Stgrade stgrade) {
		return stgradeDao.addStgrade(stgrade);
	}

	@Override
	public int deleteStgrade(Integer g_id) {
		return stgradeDao.deleteStgrade(g_id);
	}

	@Override
	public int updateStgrade(Stgrade stgrade) {
		return stgradeDao.updateStgrade(stgrade);
	}

	@Override
	public Stgrade findStgradeById(Integer g_id) {
		Stgrade stgrade = stgradeDao.findStgradeById(g_id);
		return stgrade;
	}

	@Override
	public List<Stgrade> getAll() {
		List<Stgrade> list = stgradeDao.getAll();
		return list;
	}

}

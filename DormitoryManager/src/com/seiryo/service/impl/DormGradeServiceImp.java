package com.seiryo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.seiryo.dao.DormGradeDao;
import com.seiryo.po.DormGrade;
import com.seiryo.po.PageInfo;
import com.seiryo.service.DormGradeService;

@Service("dormGradeService")
@Transactional
public class DormGradeServiceImp implements DormGradeService {

	@Autowired
	private DormGradeDao dormGradeDao;

	@Override
	public PageInfo<DormGrade> findPageInfo(Integer d_id, String d_dormbuilding, Integer pageIndex, Integer pageSize) {
		PageInfo<DormGrade> pi = new PageInfo<DormGrade>();
		pi.setPageIndex(pageIndex);
		pi.setPageSize(pageSize);
		// 获取总条数
		Integer totalCount = dormGradeDao.totalCount(d_id, d_dormbuilding);
		if (totalCount > 0) {
			pi.setTotalCount(totalCount);
			List<DormGrade> dormCleanList = dormGradeDao.getDormGradeList(d_id, d_dormbuilding,
					(pi.getPageIndex() - 1) * pi.getPageSize(), pi.getPageIndex() * pi.getPageSize());
			pi.setList(dormCleanList);
		}
		return pi;
	}

	@Override
	public int addDormGrade(DormGrade dormGrade) {
		return dormGradeDao.addDormGrade(dormGrade);
	}

	@Override
	public int deleteDormGrade(Integer g_id) {
		return dormGradeDao.deleteDormGrade(g_id);
	}

	@Override
	public int updateDormGrade(DormGrade dormGrade) {
		return dormGradeDao.updateDormGrade(dormGrade);
	}

	@Override
	public DormGrade findDormGradeById(Integer g_id) {
		DormGrade dormGrade = dormGradeDao.findDormGradeById(g_id);
		return dormGrade;
	}

	@Override
	public List<DormGrade> getAll() {
		List<DormGrade> list = dormGradeDao.getAll();
		return list;
	}

}

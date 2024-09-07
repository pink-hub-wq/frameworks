package com.seiryo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.seiryo.dao.VisitorDao;
import com.seiryo.po.PageInfo;
import com.seiryo.po.Visitor;
import com.seiryo.service.VisitorService;

@Service("visitorService")
@Transactional
public class VisitorServiceImp implements VisitorService {

	@Autowired
	private VisitorDao visitorDao;

	@Override
	public PageInfo<Visitor> findPageInfo(String v_name, Integer v_phone, Integer pageIndex, Integer pageSize) {
		PageInfo<Visitor> pi = new PageInfo<Visitor>();
		pi.setPageIndex(pageIndex);
		pi.setPageSize(pageSize);
		// 获取总条数
		Integer totalCount = visitorDao.totalCount(v_name, v_phone);
		if (totalCount > 0) {
			pi.setTotalCount(totalCount);
			List<Visitor> visitorList = visitorDao.getVisitorList(v_name, v_phone,
					(pi.getPageIndex() - 1) * pi.getPageSize(), pi.getPageIndex() * pi.getPageSize());
			pi.setList(visitorList);
		}
		return pi;
	}

	@Override
	public int addVisitor(Visitor visitor) {
		return visitorDao.addVisitor(visitor);
	}

	@Override
	public List<Visitor> getAll() {
		List<Visitor> list = visitorDao.getAll();
		return list;
	}

}

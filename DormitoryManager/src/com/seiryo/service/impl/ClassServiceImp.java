package com.seiryo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.seiryo.dao.ClassDao;
import com.seiryo.dao.StudentDao;
import com.seiryo.po.Class;
import com.seiryo.po.PageInfo;
import com.seiryo.service.ClassService;

@Service("classService")
@Transactional
public class ClassServiceImp implements ClassService {

	@Autowired
	private ClassDao classDao;

	@Override
	public PageInfo<Class> findPageInfo(String c_classname, String c_counsellor, Integer c_classid, Integer pageIndex,
			Integer pageSize) {
		PageInfo<Class> pi = new PageInfo<Class>();
		pi.setPageIndex(pageIndex);
		pi.setPageSize(pageSize);
		// 获取总条数
		Integer totalCount = classDao.totalCount(c_classname, c_classid, c_counsellor);
		if (totalCount > 0) {
			pi.setTotalCount(totalCount);
			List<Class> classList = classDao.getClassList(c_classname, c_classid, c_counsellor,
					(pi.getPageIndex() - 1) * pi.getPageSize(), pi.getPageIndex() * pi.getPageSize());
			pi.setList(classList);
		}
		return pi;
	}

	@Override
	public int addClass(Class class1) {
		return classDao.addClass(class1);
	}

	@Override
	public int deleteClass(Integer c_id) {
		return classDao.deleteClass(c_id);
	}

	@Override
	public int updateClass(Class class1) {
		return classDao.updateClass(class1);
	}

	@Override
	public Class findClassById(Integer c_id) {
		Class class1 = classDao.findClassById(c_id);
		return class1;
	}

	@Override
	public List<Class> getAll() {
		List<Class> list = classDao.getAll();
		return list;
	}

	@Override
	public List<Class> findClassStudent(Class class1) {
		List<Class> list = classDao.findClassStudent(class1);
		return list;
	}

}

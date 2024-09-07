package com.seiryo.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.seiryo.po.Class;
import com.seiryo.po.PageInfo;
import com.seiryo.po.Student;

public interface ClassService {
	// 分页查询
	public PageInfo<Class> findPageInfo(String c_classname, String c_counsellor, Integer c_classid, Integer pageIndex,
			Integer pageSize);

	// 添加
	public int addClass(Class class1);

	// 删除
	public int deleteClass(Integer c_id);

	// 修改
	public int updateClass(Class class1);

	public Class findClassById(Integer c_id);

	public List<Class> getAll();

	public List<Class> findClassStudent(Class class1);
}

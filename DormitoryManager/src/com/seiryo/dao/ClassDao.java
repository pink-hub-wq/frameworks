package com.seiryo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.seiryo.po.Class;
import com.seiryo.po.Student;

public interface ClassDao {
	/**
	 * 进行分页查询
	 */

	// 获取总条数
	public Integer totalCount(@Param("c_classname") String c_classname, @Param("c_classid") Integer c_classid,
			@Param("c_counsellor") String c_counsellor);

	// 获取用户列表
	public List<Class> getClassList(@Param("c_classname") String c_classname, @Param("c_classid") Integer c_classid,
			@Param("c_counsellor") String c_counsellor, @Param("currentPage") Integer currentPage,
			@Param("pageSize") Integer pageSize);

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

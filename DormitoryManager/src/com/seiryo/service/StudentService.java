package com.seiryo.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.seiryo.po.Admin;
import com.seiryo.po.PageInfo;
import com.seiryo.po.Student;

public interface StudentService {
	// 分页查询
	public PageInfo<Student> findPageInfo(String s_name, Integer s_studentid, Integer s_classid, String s_classname,
			Integer pageIndex, Integer pageSize);

	// 添加
	public int addStudent(Student student);

	// 删除
	public int deleteStudent(Integer s_id);

	// 修改
	public int updateStudent(Student student);

	public Student findStudentById(Integer s_id);

	public List<Student> getAll();
}

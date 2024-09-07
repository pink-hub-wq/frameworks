package com.seiryo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.seiryo.po.Student;

public interface StudentDao {
	/**
	 * 进行分页查询
	 */

	// 获取总条数
	public Integer totalCount(@Param("s_name") String s_name, @Param("s_studentid") Integer s_studentid,
			@Param("s_classid") Integer s_classid, @Param("s_classname") String s_classname);

	// 获取用户列表
	public List<Student> getStudentList(@Param("s_name") String s_name, @Param("s_studentid") Integer s_studentid,
			@Param("s_classid") Integer s_classid, @Param("s_classname") String s_classname,
			@Param("currentPage") Integer currentPage, @Param("pageSize") Integer pageSize);

	// 添加
	public int addStudent(Student student);

	// 删除
	public int deleteStudent(Integer s_id);

	// 修改
	public int updateStudent(Student student);

	public Student findStudentById(Integer s_id);

	public List<Student> getAll();
}

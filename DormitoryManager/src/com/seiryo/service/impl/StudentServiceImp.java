package com.seiryo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.seiryo.dao.StudentDao;
import com.seiryo.po.PageInfo;
import com.seiryo.po.Student;
import com.seiryo.service.StudentService;

@Service("studentService")
@Transactional
public class StudentServiceImp implements StudentService {

	@Autowired
	private StudentDao studentDao;

	// 分页查询
	public PageInfo<Student> findPageInfo(String s_name, Integer s_studentid, Integer s_classid, String s_classname,
			Integer pageIndex, Integer pageSize) {
		PageInfo<Student> pi = new PageInfo<Student>();
		pi.setPageIndex(pageIndex);
		pi.setPageSize(pageSize);
		// 获取总条数
		Integer totalCount = studentDao.totalCount(s_name, s_studentid, s_classid, s_classname);
		if (totalCount > 0) {
			pi.setTotalCount(totalCount);
			List<Student> studentList = studentDao.getStudentList(s_name, s_studentid, s_classid, s_classname,
					(pi.getPageIndex() - 1) * pi.getPageSize(), pi.getPageIndex() * pi.getPageSize());
			pi.setList(studentList);
		}
		return pi;
	}

	public List<Student> getAll() {
		List<Student> studentList = studentDao.getAll();
		return studentList;
	}

	// 删除
	public int deleteStudent(Integer s_id) {
		return studentDao.deleteStudent(s_id);
	}

	// 添加
	public int addStudent(Student student) {
		return studentDao.addStudent(student);
	}

	// 修改
	public int updateStudent(Student student) {
		return studentDao.updateStudent(student);
	}

	public Student findStudentById(Integer s_id) {
		Student student = studentDao.findStudentById(s_id);
		return student;
	}

}

package com.edu.seiryo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.edu.seiryo.entity.Department;

@Mapper
public interface DepartmentMapper {
	List<Department> getDepartments();
	Department getDepartment(@Param("id")Integer id);
}

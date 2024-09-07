package com.edu.seiryo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.alibaba.druid.pool.DruidDataSource;
import com.edu.seiryo.controller.DepartmentController;
import com.edu.seiryo.controller.EmployeeController;
import com.edu.seiryo.controller.JdbcController;
import com.edu.seiryo.entity.Employee;
import com.edu.seiryo.mapper.DepartmentMapper;

@SpringBootTest
class SpringBootDemo2ApplicationTests {

	@Autowired
	DataSource dataSource;

	@Autowired
	JdbcController JdbcController;
	
	@Autowired
	DepartmentController departmentController;
	
	@Autowired
	EmployeeController employeeController;
	@Autowired
	DepartmentMapper departmentMapper;

	@Test
	void contextLoads() throws SQLException {
		System.out.println(dataSource.getClass());
		Connection connection = dataSource.getConnection();
		System.out.println(connection);
		DruidDataSource druidDataSource = (DruidDataSource) dataSource;
		System.out.println("druidDataSource 数据源最大连接数：" + druidDataSource.getMaxActive());
		System.out.println("druidDataSource 数据源初始化连接数：" + druidDataSource.getInitialSize());
		connection.close();
	}
//    @Test
//    void contextLoads2() throws SQLException {
//    	List<Map<String, Object>> list = JdbcController.userList();
//    	System.out.println(list);
//    }
//    @Test
//    void contextLoads3() throws SQLException {
//    	JdbcController.addUser();
//    }
//    @Test
//    void contextLoads4() throws SQLException {
//    	JdbcController.updateUser(1002);
//    }
//    @Test
//    void contextLoads5() throws SQLException {
//    	JdbcController.delUser(1002);
//    }
	@Test
	void contextLoads5() throws SQLException {
		departmentController.getDepartments();
	}
	@Test
	void contextLoads6() throws SQLException {
		departmentMapper.getDepartment(102);
	}
	@Test
	void contextLoads7() throws SQLException {
		employeeController.getEmployees();
	}
	@Test
	void contextLoads8() throws SQLException {
		employeeController.save();
	}
	@Test
	void contextLoads9() throws SQLException {
		employeeController.get(1001);
	}
	@Test
	void contextLoads10() throws SQLException {
		employeeController.delete(1001);
	}
}

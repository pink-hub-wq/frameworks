package com.edu.seiryo.controller;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jdbc")
public class JdbcController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/list")
    public List<Map<String, Object>> userList() {
        String sql = "select * from employee";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        return maps;
    }

    @GetMapping("/add")
    public String addUser() {
        String sql = "insert into employee (last_name, email, gender, department_id, birth) VALUES (?, ?, ?, ?, ?)";
        Date date = new Date(System.currentTimeMillis());
        jdbcTemplate.update(sql, "狂神说", "24736743@qq.com", 1, 101, date);
        return "addOk";
    }

    @GetMapping("/update/{id}")
    public String updateUser(@PathVariable("id") int id) {
        String sql = "update employee set last_name = ?, email = ? where id = ?";
        jdbcTemplate.update(sql, "秦疆", "24736743@sina.com", id);
        return "updateOk";
    }

    @GetMapping("/delete/{id}")
    public String delUser(@PathVariable("id") int id) {
        String sql = "delete from employee where id = ?";
        jdbcTemplate.update(sql, id);
        return "deleteOk";
    }   
}

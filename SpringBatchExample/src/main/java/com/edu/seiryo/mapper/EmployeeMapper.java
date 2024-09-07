package com.edu.seiryo.mapper;

import com.edu.seiryo.entity.Employee;

public interface EmployeeMapper {

    /**
     * 添加
     */
    int save(Employee employee);

    /**
     * 添加临时表
     * @param employee
     * @return
     */
    int saveTemp(Employee employee);

    /**
     * 清空数据
     */
    void truncateAll();

    /**
     * 清空临时表数据
     */
    void truncateTemp();
    void selectTempForList();
}


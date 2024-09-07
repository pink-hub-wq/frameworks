package com.edu.seiryo.dao;

import java.io.Serializable;
import java.util.*;

import com.edu.seiryo.entity.Order;

public interface OrderDao {
	/**
	 * 查看所有订单
	 * @return 所有订单
	 */
	List<Order> query();
	/**
	 * 更新订单状态
	 * @param orderId
	 * @param state
	 * @return true 成功/false 失败
	 */
	void update(Order order);
	/**
	 * 根据订单编号查订单
	 * @param orderId
	 * @return 编号
	 */
	Order queryOrderByOrderId(String OrderId);
	/**
	 * 添加订单
	 * @param order
	 * @return true 成功/false 失败
	 */
	void add(Order order);
}

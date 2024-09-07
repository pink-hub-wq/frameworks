package com.edu.seiryo.service.imp;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.seiryo.dao.OrderDao;
import com.edu.seiryo.dao.imp.OrderDaoImp;
import com.edu.seiryo.entity.Order;
import com.edu.seiryo.service.OrderService;
import com.sun.org.apache.xpath.internal.operations.Or;
@Service
public class OrderServiceImp implements OrderService {
	@Autowired
	OrderDao orderDao;
	
	public OrderDao getOrderDao() {
		return orderDao;
	}
	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}
	/**
	 * 查看所有订单
	 */
	@Override
	public List<Order> query() {
		return orderDao.query();
	}
	
	/**
	 * 更新订单状态
	 */
	
	@Override
	public void update(Order order) {
		orderDao.update(order);
	}
	/**
	 * 添加订单
	 */

	@Override
	public void add(Order order) {
		orderDao.add(order);
	}
	/**
	 * 根据订单编号查订单
	 */
	@Override
	public Order queryOrderByOrderId(String OrderId){
		return orderDao.queryOrderByOrderId(OrderId);
	}
	
}

package com.edu.seiryo.dao.imp;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.edu.seiryo.dao.OrderDao;
import com.edu.seiryo.entity.Order;
import com.edu.seiryo.util.BaseDaoImp;
@Repository
public class OrderDaoImp extends BaseDaoImp<Order>implements OrderDao  {

	/**
	 * 根据订单编号，查询订单
	 * @param orderId
	 * @return
	 */
	@Override
	public Order queryOrderByOrderId(String orderId) {
	    List<Order> orders = (List<Order>) this.getHibernateTemplate().find("from Order where orderId = ?", orderId);
	    return (orders != null && !orders.isEmpty()) ? orders.get(0) : null;
	}

}

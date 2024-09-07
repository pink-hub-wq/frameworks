package com.edu.seiryo.service.imp;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.seiryo.dao.OrderDetailDao;
import com.edu.seiryo.dao.imp.OrderDetailDaoImp;
import com.edu.seiryo.entity.OrderDetail;
import com.edu.seiryo.service.OrderDetailService;
@Service
public class OrderDetailServiceImp implements OrderDetailService {
	@Autowired
	OrderDetailDao orderDetailDao;
	
	public OrderDetailDao getOrderDetailDao() {
		return orderDetailDao;
	}
	public void setOrderDetailDao(OrderDetailDao orderDetailDao) {
		this.orderDetailDao = orderDetailDao;
	}
	/**
	 * ���ݱ�Ų�ѯ��Ʒ��ϸ
	 */
	@Override
	public List<OrderDetail> queryByOrderId(Integer orderId){
		return orderDetailDao.queryByOrderId(orderId);
	}
	/**
	 * �����Ʒ��ϸ
	 */

	@Override
	public void add(OrderDetail orderDetail) {
		orderDetailDao.add(orderDetail);
	}


}

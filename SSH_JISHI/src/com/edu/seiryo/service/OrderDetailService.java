package com.edu.seiryo.service;

import java.io.Serializable;
import java.util.List;

import com.edu.seiryo.entity.OrderDetail;

public interface OrderDetailService {
	/**
	 * ���ݱ�Ų�ѯ��Ʒ��ϸ
	 * @param orderId
	 * @return ��Ʒ��ϸ
	 */
	List<OrderDetail> queryByOrderId(Integer orderId);
	/**
	 * �����Ʒ��ϸ
	 * @param orderDetail
	 * @return
	 */
	void add(OrderDetail orderDetail);
}

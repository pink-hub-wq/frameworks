package com.edu.seiryo.dao;

import java.io.Serializable;
import java.util.List;

import com.edu.seiryo.entity.OrderDetail;

public interface OrderDetailDao {
	/**
	 * 根据编号查询商品明细
	 * @param orderId
	 * @return 商品明细
	 */
	List<OrderDetail> queryByOrderId(Integer orderId);;
	/**
	 * 添加商品明细
	 * @param orderDetail
	 * @return
	 */
	void add(OrderDetail orderDetail);
}

package com.edu.seiryo.dao;

import java.io.Serializable;
import java.util.*;

import com.edu.seiryo.entity.Order;

public interface OrderDao {
	/**
	 * �鿴���ж���
	 * @return ���ж���
	 */
	List<Order> query();
	/**
	 * ���¶���״̬
	 * @param orderId
	 * @param state
	 * @return true �ɹ�/false ʧ��
	 */
	void update(Order order);
	/**
	 * ���ݶ�����Ų鶩��
	 * @param orderId
	 * @return ���
	 */
	Order queryOrderByOrderId(String OrderId);
	/**
	 * ��Ӷ���
	 * @param order
	 * @return true �ɹ�/false ʧ��
	 */
	void add(Order order);
}

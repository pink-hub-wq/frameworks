package com.edu.seiryo.entity;
/**
 * 订单明细信息
 * @author WANGQI
 * @date 2024年7月1日
 * @project_name JSP_Jishi_王萁
 * @package_name com.edu.seiryo.entity
 * @file_name OrderDetail.java
 * @classname OrderDetail
 * @version
 */
public class OrderDetail {
	private Integer id;
	private Integer orderId;
	private Integer shopId;
	private Integer quantity;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Integer getShopId() {
		return shopId;
	}
	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public OrderDetail(Integer id, Integer orderId, Integer shopId, Integer quantity) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.shopId = shopId;
		this.quantity = quantity;
	}
	public OrderDetail(Integer orderId, Integer shopId, Integer quantity) {
		super();
		this.orderId = orderId;
		this.shopId = shopId;
		this.quantity = quantity;
	}
	public OrderDetail() {
		super();
	}
	@Override
	public String toString() {
		return "OrderDetail [id=" + id + ", orderId=" + orderId + ", shopId=" + shopId + ", quantity=" + quantity + "]";
	}
	
}
	
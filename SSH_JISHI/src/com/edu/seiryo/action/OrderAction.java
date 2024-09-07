package com.edu.seiryo.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.edu.seiryo.entity.Cart;
import com.edu.seiryo.entity.Order;
import com.edu.seiryo.entity.OrderDetail;
import com.edu.seiryo.entity.UserInfo;
import com.edu.seiryo.util.BaseAction;
import com.sun.org.apache.xpath.internal.operations.Or;

public class OrderAction extends BaseAction<Order> {
	private static int orderId = 000001;
	private String newState;
	private double totalAmount;
	
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public void setNewState(String newState) {
	    this.newState = newState;
	}
//	public String query() {
//		System.out.println(this.getModel().getOrderId());
//		Order order = this.getOrderServiceImp().query();
//		System.out.println(order);
//		getSession().put("order", order);
//		return SUCCESS;
//	}
//	public String queryStatus() {
//		int i = this.getOrderServiceImp().queryStatusByOrderId(this.getModel().getOrderId());
//		getSession().put("status", i);
//		return "index";
//	}
	public String queryStatus() {
		String statusString = "";
		String orderId = (String) getRequest().get("orderId");
		System.out.println(orderId);
		int status = -1;
		try {
			status = this.getOrderServiceImp().queryOrderByOrderId(orderId).getState();
		} catch (Exception e) {
			statusString = "您输入的订单号有误";
		}
	    
	    PrintWriter out = null;
		try {
			out = getResponse().getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    if(status != -1){
	    	switch (status) {
	    	case 0:
	            statusString = "订单待审核";
	            break;
	        case 1:
	            statusString = "订单已审核";
	            break;
	        case 2:
	        	statusString = "订单已付款";
	            break;
	        case 3:
	        	statusString = "订单已发货";
	            break;
	    }
	}else {
    	statusString = "您输入的订单号有误";
	}
	    out.print(statusString);
	    out.flush();
	    out.close();
		return "index";
	}
	public String update() {
		String orderId = (String) getRequest().get("orderId");
		System.out.println(orderId);
	    Order order = this.getOrderServiceImp().queryOrderByOrderId(orderId);
	    try {
	    	order.setState(Integer.parseInt(newState));
	        this.getOrderServiceImp().update(order);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return "orderInfo";
	}
	public String creatOrder(){
		System.out.println("totalAmount:" + totalAmount);
		Order order= new Order();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String today = sdf.format(new Date());
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		String today2 = sdf2.format(new Date());
		order.setOrderId(today + orderId);
		orderId++;
		order.setState(0);
		order.setCreateDtm(today2);
		this.getOrderServiceImp().add(order);
		List<Cart> list = (List<Cart>) getSession().get("cart");
		OrderDetail orderDetail = new OrderDetail();
		for (Cart cart : list) {
			order.setId(this.getOrderServiceImp().queryOrderByOrderId(order.getOrderId()).getId());
			orderDetail.setOrderId(order.getId());
			orderDetail.setShopId(this.getShopInfoServiceImp().queryShopInfoIdByName(cart.getShomName()));
			orderDetail.setQuantity(cart.getNumber());
			this.getOrderDetailServiceImp().add(orderDetail);
		}
		this.getOrderDetailServiceImp().add(orderDetail);
		getRequest().put("order", order);
		getRequest().put("totalAmount", totalAmount);
		getSession().remove("cart");
		return "order";
	}
}


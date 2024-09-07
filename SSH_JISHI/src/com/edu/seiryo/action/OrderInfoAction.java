package com.edu.seiryo.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

import com.edu.seiryo.entity.Order;
import com.edu.seiryo.entity.OrderDetail;
import com.edu.seiryo.entity.OrderDetails;
import com.edu.seiryo.util.BaseAction;
import com.opensymphony.xwork2.ActionContext;

public class OrderInfoAction extends BaseAction<OrderDetail> {
	private String orderId;
	
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String queryOrderDetailById() {
		getSession().remove("orderDetailsList");
		Map<String, Object> parameters = ActionContext.getContext().getParameters();
	    String[] orderIdArray = (String[]) parameters.get("orderId");
	    orderId = orderIdArray[0];
	    System.out.println(orderId);
		Order order = this.getOrderServiceImp().queryOrderByOrderId(orderId);
		int orderId = order.getId();
		System.out.println(orderId);
	    List<OrderDetail> list = this.getOrderDetailServiceImp().queryByOrderId(orderId);
	    System.out.println(list);
       
        List<OrderDetails> orderDetailsList = new ArrayList<OrderDetails>();

        for (OrderDetail detail : list) {
            int shopId = detail.getShopId();
            String shopName = this.getShopInfoServiceImp().queryById(detail.getShopId()).getShopName();
            int quantity = detail.getQuantity();
            double price = this.getShopInfoServiceImp().queryById(detail.getShopId()).getPrice();
            double amount = quantity * price;
            OrderDetails orderDetails = new OrderDetails(shopId, shopName, quantity, price,quantity*price);
            orderDetailsList.add(orderDetails);
        }
        getSession().put("orderDetailsList", orderDetailsList);

		return "orderInfo";
	}
}

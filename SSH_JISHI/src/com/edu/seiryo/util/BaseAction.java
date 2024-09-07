package com.edu.seiryo.util;

import java.lang.reflect.ParameterizedType;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.edu.seiryo.service.LogService;
import com.edu.seiryo.service.OrderDetailService;
import com.edu.seiryo.service.OrderService;
import com.edu.seiryo.service.ShopInfoService;
import com.edu.seiryo.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class BaseAction<T> extends ActionSupport implements ModelDriven<T>{
	private T t;
	private String url = "";
	private String msg = "";
	public BaseAction() {
		try {
			ParameterizedType parameterizedType = (ParameterizedType) this.getClass().getGenericSuperclass();
			Class<T> clazz = (Class<T>) parameterizedType.getActualTypeArguments()[0];
			t = clazz.newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		} 
	}
	@Override
	public T getModel() {
		return t;
	}
	
	// ע����Ҫʹ�õ�service���ṩget��set����
	UserService userServiceImp;
	
	public UserService getUserServiceImp() {
		return userServiceImp;
	}
	public void setUserServiceImp(UserService userServiceImp) {
		this.userServiceImp = userServiceImp;
	}
	OrderService orderServiceImp;
	
	public OrderService getOrderServiceImp() {
		return orderServiceImp;
	}
	public void setOrderServiceImp(OrderService orderServiceImp) {
		this.orderServiceImp = orderServiceImp;
	}
	OrderDetailService orderDetailServiceImp;
	
	public OrderDetailService getOrderDetailServiceImp() {
		return orderDetailServiceImp;
	}
	public void setOrderDetailServiceImp(OrderDetailService orderDetailServiceImp) {
		this.orderDetailServiceImp = orderDetailServiceImp;
	}
	ShopInfoService shopInfoServiceImp;
	
	public ShopInfoService getShopInfoServiceImp() {
		return shopInfoServiceImp;
	}
	public void setShopInfoServiceImp(ShopInfoService shopInfoServiceImp) {
		this.shopInfoServiceImp = shopInfoServiceImp;
	}
	LogService logServiceImp;
	
	public LogService getLogServiceImp() {
		return logServiceImp;
	}
	public void setLogServiceImp(LogService logServiceImp) {
		this.logServiceImp = logServiceImp;
	}
	// �ṩ���ٻ�ȡ����ķ���
	public Map<String, Object> getRequest() {
		return (Map) ActionContext.getContext().get("request");
	}

	public Map<String, Object> getSession() {
		return ActionContext.getContext().getSession();
	}

	public Map<String, Object> getApplication() {
		return (Map)ActionContext.getContext().getApplication();
	}
		
	public HttpServletResponse getResponse() {
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=gbk");
		response.setCharacterEncoding("gbk");
		return response;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
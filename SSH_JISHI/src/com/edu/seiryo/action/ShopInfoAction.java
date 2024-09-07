package com.edu.seiryo.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.edu.seiryo.entity.Cart;
import com.edu.seiryo.entity.ShopInfo;
import com.edu.seiryo.util.BaseAction;

public class ShopInfoAction extends BaseAction<ShopInfo> {
	private String shopId;
	private int number;
	public String getShopId() {
		return shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String query() {
		List<ShopInfo> list = this.getShopInfoServiceImp().query();
		getSession().put("shopInfoList", list);
		return "index";
	}
	public String add() {
		String shopId = (String) getRequest().get("shopId");
		String shopName = (String) getRequest().get("shopName");
		System.out.println("shopId: " + shopId + ", shopName: " + shopName);
		Double price1 = (Double) getRequest().get("price");
        float price = price1.floatValue();
		List<Cart> list = (List<Cart>) getSession().get("cart");
		if(list == null){
			list = new ArrayList<Cart>();
		}
		boolean bo = true;
		for (Cart cart : list) {
			if(Integer.parseInt(shopId) ==cart.getId()){
				bo = false;
				cart.setNumber(cart.getNumber()+1);
				cart.setTotalPrice(cart.getNumber() * cart.getPrice());
				break;
			}
		}
		if(bo){
			Cart cart = new Cart(Integer.parseInt(shopId), shopName, price, 1, price *1);
			list.add(cart);
		}
		getSession().put("cart", list);
		return "cart";
	}
	public String delete() {
	    String deleteId = (String) getRequest().get("shopId");
	    List<Cart> list = (List<Cart>) getSession().get("cart");
	    if (list == null) {
	    	 list = new ArrayList<Cart>();
	    }
	    for (Cart cart : list) {
			 if(Integer.parseInt(deleteId) == cart.getId()){
				 list.remove(cart);
				 break;
			 }
		}
	    getSession().put("cart", list);
	    return "cart";
	}
	public String clearCart(){
		getSession().remove("cart");
		List<ShopInfo> list = this.getShopInfoServiceImp().query();
		getSession().put("shopInfoList", list);
		return "index";
	}
	public String updateShopInfoNumber(){
		String shopId = (String) getRequest().get("shopId");
		System.out.println("shopId: " + shopId + ", number: " + number);
		int number = (int) getRequest().get("number");
		List<Cart> list = (List<Cart>) getSession().get("cart");
		if (list == null) {
	        list = new ArrayList<Cart>();
	    }
	    for (Cart cart : list) {
	        if(Integer.parseInt(shopId) == cart.getId()){
	            cart.setNumber(number);
	            cart.setTotalPrice(cart.getNumber() * cart.getPrice());
	            break;
	        }
	    }
	    System.out.println(list);
	    getSession().put("cart", list);
	    return "cart";
	}
}

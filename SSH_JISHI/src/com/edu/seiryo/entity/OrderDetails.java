package com.edu.seiryo.entity;

public class OrderDetails {
	private int shopId;
    private String shopName;
    private int quantity;
    private double price;
    private double amount;
	public int getShopId() {
		return shopId;
	}
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public OrderDetails(int shopId, String shopName, int quantity, double price, double amount) {
		super();
		this.shopId = shopId;
		this.shopName = shopName;
		this.quantity = quantity;
		this.price = price;
		this.amount = amount;
	}
	
	public OrderDetails() {
		super();
	}
	@Override
	public String toString() {
		return "OrderDetails [shopId=" + shopId + ", shopName=" + shopName + ", quantity=" + quantity + ", price="
				+ price + ", amount=" + amount + "]";
	}
    
}

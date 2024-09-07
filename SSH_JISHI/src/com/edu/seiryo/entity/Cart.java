package com.edu.seiryo.entity;

public class Cart {
	private Integer id;
	private String shomName;
	private float price;
	private Integer number;
	private float totalPrice;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getShomName() {
		return shomName;
	}
	public void setShomName(String shomName) {
		this.shomName = shomName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Cart(int id, String shomName, float price, Integer number, float totalPrice) {
		super();
		this.id = id;
		this.shomName = shomName;
		this.price = price;
		this.number = number;
		this.totalPrice = totalPrice;
	}
	public Cart(String shomName, float price, Integer number, float totalPrice) {
		super();
		this.shomName = shomName;
		this.price = price;
		this.number = number;
		this.totalPrice = totalPrice;
	}
	public Cart() {
		super();
	}
	@Override
	public String toString() {
		return "Cart [id=" + id + ", shomName=" + shomName + ", price=" + price + ", number=" + number + ", totalPrice="
				+ totalPrice + ", allTotalPrice=" + "]";
	}
	
}

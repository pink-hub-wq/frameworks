package com.edu.seiryo.entity;
/**
 * 商品信息
 * @author WANGQI
 * @date 2024年7月1日
 * @project_name JSP_Jishi_王萁
 * @package_name com.edu.seiryo.entity
 * @file_name ShopInfo.java
 * @classname ShopInfo
 * @version
 */
public class ShopInfo {
	private Integer id;
	private String shopId;
	private String shopName;
	private double price;
	private double oldPrice;
	private String descr;
	private String insertDtm;
	private String imgSrc;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getShopId() {
		return shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getOldPrice() {
		return oldPrice;
	}
	public void setOldPrice(double oldPrice) {
		this.oldPrice = oldPrice;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public String getInsertDtm() {
		return insertDtm;
	}
	public void setInsertDtm(String insertDtm) {
		this.insertDtm = insertDtm;
	}
	
	public String getImgSrc() {
		return imgSrc;
	}
	public void setImgSrc(String imgSrc) {
		this.imgSrc = imgSrc;
	}
	public ShopInfo(Integer id, String shopId, String shopName, double price, double oldPrice, String descr,
			String insertDtm, String imgSrc) {
		super();
		this.id = id;
		this.shopId = shopId;
		this.shopName = shopName;
		this.price = price;
		this.oldPrice = oldPrice;
		this.descr = descr;
		this.insertDtm = insertDtm;
		this.imgSrc = imgSrc;
	}
	public ShopInfo(String shopId, String shopName, double price, double oldPrice, String descr, String insertDtm,
			String imgSrc) {
		super();
		this.shopId = shopId;
		this.shopName = shopName;
		this.price = price;
		this.oldPrice = oldPrice;
		this.descr = descr;
		this.insertDtm = insertDtm;
		this.imgSrc = imgSrc;
	}
	
	public ShopInfo() {
		super();
	}
	@Override
	public String toString() {
		return "ShopInfo [id=" + id + ", shopId=" + shopId + ", shopName=" + shopName + ", price=" + price
				+ ", oldPrice=" + oldPrice + ", descr=" + descr + ", insertDtm=" + insertDtm + ", imgSrc=" + imgSrc
				+ "]";
	}
	
	
}

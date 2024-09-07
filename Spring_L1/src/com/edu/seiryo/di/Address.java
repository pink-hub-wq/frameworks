package com.edu.seiryo.di;

public class Address {
	private int id;
	private String address;
	private String addressNumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddressNumber() {
		return addressNumber;
	}
	public void setAddressNumber(String addressNumber) {
		this.addressNumber = addressNumber;
	}
	public Address(int id, String address, String addressNumber) {
		super();
		this.id = id;
		this.address = address;
		this.addressNumber = addressNumber;
	}
	public Address(String address, String addressNumber) {
		super();
		this.address = address;
		this.addressNumber = addressNumber;
	}
	public Address() {
		super();
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", address=" + address + ", addressNumber=" + addressNumber + "]";
	}
	
}

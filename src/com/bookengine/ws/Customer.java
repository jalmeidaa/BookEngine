package com.bookengine.ws;

public class Customer {
 
	private String name;
	private String address;
	private String phone;
	private String custId;
	
	public Customer(){
		name = "John Smith";
		address = "312 N State Street, Chicago IL 60611";
		phone = "312-345-9876";
		custId = "12345";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	
	
	
	
	
	
}

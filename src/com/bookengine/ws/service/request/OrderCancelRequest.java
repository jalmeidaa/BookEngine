package com.bookengine.ws.service.request;

import java.util.Set;

public class OrderCancelRequest {

	private String OrderID;
	private String status;
	
	public OrderCancelRequest(){
		
	}
	public String getOrderID() {
		return OrderID;
	}
	public void setOrderID(String orderID) {
		OrderID = orderID;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}

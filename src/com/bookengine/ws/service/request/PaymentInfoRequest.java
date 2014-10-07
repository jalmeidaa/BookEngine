package com.bookengine.ws.service.request;

public class PaymentInfoRequest {

	private String orderId;
	
	public PaymentInfoRequest(){
		
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
	
}

package com.bookengine.ws.service.request;

import java.util.Set;

import com.bookengine.ws.*;

public class OrderRequest {

	private String orderId;
	private String bookId;
	private String status;
	private Customer customer;
	private PaymentInfo paymentinfo;

	public OrderRequest() {

	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public PaymentInfo getPaymentinfo() {
		return paymentinfo;
	}

	public void setPaymentinfo(PaymentInfo paymentinfo) {
		this.paymentinfo = paymentinfo;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	
	public String getBookId() {
		return bookId;
	}

	

}

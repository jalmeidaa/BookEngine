package com.bookengine.ws.service;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.bookengine.ws.Customer;
import com.bookengine.ws.Order;
import com.bookengine.ws.PaymentInfo;
import com.bookengine.ws.service.request.CustomerRequest;
import com.bookengine.ws.service.request.OrderRequest;
import com.bookengine.ws.service.request.PaymentInfoRequest;

@WebService
public interface OrderService {
	
	@WebResult(targetNamespace="", name="Order")
	Order buyBooks(@WebParam(name="OrderRequest") OrderRequest orderRequest);
	
	
	@WebResult(targetNamespace="", name="Order")
	String getOrderStatus(@WebParam(name="OrderRequest") OrderRequest orderRequest);
	
	@WebResult(targetNamespace="", name="Order")
	Order getOrder(@WebParam(name="OrderRequest") OrderRequest orderRequest);
	
	@WebResult(targetNamespace="", name="Customer")
	Customer getCustomerInfo(@WebParam(name="CustomerRequest") CustomerRequest customerRequest);
	
	@WebResult(targetNamespace="", name="PaymentInfo")
	PaymentInfo getPaymentInfo(@WebParam(name="PaymentInfoRequest") PaymentInfoRequest paymentInfoRequest);

}

package com.bookengine.ws.service;

import javax.jws.WebService;


import com.bookengine.ws.Customer;
import com.bookengine.ws.Order;
import com.bookengine.ws.OrderDAO;
import com.bookengine.ws.PaymentInfo;
import com.bookengine.ws.service.request.CustomerRequest;
import com.bookengine.ws.service.request.OrderRequest;
import com.bookengine.ws.service.request.PaymentInfoRequest;

@WebService(endpointInterface = "com.bookengine.ws.service.OrderService", serviceName = "OrderServices")
public class OrderServiceImpl implements OrderService {

	OrderDAO dao = new OrderDAO();
	public Order getOrder(OrderRequest orderRequest) {
		
		return dao.getOrder(orderRequest.getOrderId());
	}

	public String getOrderStatus(OrderRequest orderRequest) {
		
		return dao.getOrderStatus(orderRequest.getOrderId());
	}

	public Customer getCustomerInfo(CustomerRequest customerRequest) {

		return dao.getCustomerInfo(customerRequest.getOrderID());
	}

	public PaymentInfo getPaymentInfo(PaymentInfoRequest paymentInfoRequest) {
		
		return dao.getOrder(paymentInfoRequest.getOrderId()).getPaymentinfo();
	}
	
	public Order buyBooks( OrderRequest orderRequest )
	{    
		Order order = new Order( orderRequest.getOrderId(),orderRequest.getBookId(), orderRequest.getStatus(),
				orderRequest.getCustomer( ), orderRequest.getPaymentinfo());	
		
		return dao.buyBooks(order);
	}


	
}

package com.bookengine.ws.service;

import javax.jws.WebService;

import com.bookengine.ws.OrderCancel;
import com.bookengine.ws.OrderCancelDAO;
import com.bookengine.ws.service.request.OrderCancelRequest;

@WebService(endpointInterface = "com.bookengine.ws.service.OrderCancelService", serviceName = "OrderCancelServices")
public class OrderCancelServiceImpl implements OrderCancelService {

	public OrderCancel cancelOrder(OrderCancelRequest orderCancelRequest) {
		OrderCancelDAO dao = new OrderCancelDAO();
		return dao.cancelOrder(orderCancelRequest.getOrderID());
	}

	public OrderCancel getOrder(OrderCancelRequest orderCancelRequest) {
		OrderCancelDAO dao = new OrderCancelDAO();
		return dao.getOrder(orderCancelRequest.getOrderID());
	}

	
}

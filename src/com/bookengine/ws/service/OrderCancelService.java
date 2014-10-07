package com.bookengine.ws.service;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.bookengine.ws.OrderCancel;
import com.bookengine.ws.service.request.OrderCancelRequest;

@WebService
public interface OrderCancelService {

	@WebResult(targetNamespace = "", name = "OrderCancel")
	OrderCancel cancelOrder(@WebParam(name = "OrderCancelRequest") OrderCancelRequest orderCancelRequest);

	
	@WebResult(targetNamespace="", name="OrderCancel")
	OrderCancel getOrder(@WebParam(name="OrderCancelRequest") OrderCancelRequest orderCancelRequest);
}

package com.bookengine.ws.client;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.bookengine.ws.OrderCancel;
import com.bookengine.ws.service.OrderCancelService;
import com.bookengine.ws.service.request.OrderCancelRequest;

public class OrderCancelServiceClient {
	public static void main(String args[]) throws Exception {

		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

		factory.getInInterceptors().add(new LoggingInInterceptor());
		factory.getOutInterceptors().add(new LoggingOutInterceptor());

		factory.setBindingId("http://cxf.apache.org/bindings/xformat");

		factory.setServiceClass(OrderCancelService.class);
		factory.setAddress("http://localhost:8080/BookEngine/services/cxfOrderCancelService");
		OrderCancelService orderCancelService = (OrderCancelService) factory
				.create();

		OrderCancelRequest orderCancelRequest = new OrderCancelRequest();
		orderCancelRequest.setOrderID("567");
		OrderCancel cancelled = orderCancelService.cancelOrder(orderCancelRequest);
		if(cancelled.getStatus().equals("Shipped"))
			System.out.println("Your order Has been Shipped it cannot be Cancelled!");
		else
		{
			System.out.println("Your Order has been Cancelled");
		System.out.println("Details: \n" + "Order Id:" + cancelled.getOrderID() + "\nOrder Status:"
				+ cancelled.getStatus());
		}
				
		
		OrderCancelRequest orderCancelRequest1 = new OrderCancelRequest();
		orderCancelRequest1.setOrderID("456");	
				OrderCancel cancelled2 = orderCancelService.cancelOrder(orderCancelRequest1);
				if(cancelled2.getStatus().equals("Shipped"))
					System.out.println("Order Has been Shipped it cannot be Cancelled!");	
				else
				{
					
				 System.out.println("Your Order has been Cancelled");
				 System.out.println("Order Details: \n" + "Order Id:" + cancelled2.getOrderID() + "\n Order Status:"
						+ cancelled2.getStatus());
				}
		System.exit(0);
	}
}

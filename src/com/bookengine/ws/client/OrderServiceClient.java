package com.bookengine.ws.client;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.bookengine.ws.Customer;
import com.bookengine.ws.Order;
import com.bookengine.ws.PaymentInfo;
import com.bookengine.ws.service.OrderService;
import com.bookengine.ws.service.request.CustomerRequest;
import com.bookengine.ws.service.request.OrderRequest;
import com.bookengine.ws.service.request.PaymentInfoRequest;

public class OrderServiceClient {

	public OrderServiceClient() {

	}

	public static void main(String args[]) throws Exception {

		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

		factory.getInInterceptors().add(new LoggingInInterceptor());
		factory.getOutInterceptors().add(new LoggingOutInterceptor());

		factory.setBindingId("http://cxf.apache.org/bindings/xformat");

		factory.setServiceClass(OrderService.class);
		factory.setAddress("http://localhost:8080/BookEngine/services/cxfOrderService");
		OrderService orderService = (OrderService) factory.create();
		
		OrderRequest orderRequest = new OrderRequest();
		orderRequest.setOrderId("567");
		orderRequest.setStatus("Ordered");
		orderRequest.setBookId("1");
		Customer customer = new Customer( );
		orderRequest.setCustomer(customer);
		PaymentInfo paymentinfo = new PaymentInfo();
		orderRequest.setPaymentinfo(paymentinfo);
		
		Order order = orderService.buyBooks(orderRequest);
		//Order order2 = orderService.getOrder(orderRequest2);
		System.out.println("Order Details: \n " + "Order ID:" + order.getOrderID() + "\n Book ID:"
				 + order.getBookID() + "\n Status:" +order.getStatus());

		
		OrderRequest orderRequest2 = new OrderRequest();
		orderRequest2.setOrderId("463");
		orderRequest2.setStatus("Shipped");
		orderRequest2.setBookId("3");
		Customer customer2 = new Customer( );
		orderRequest.setCustomer(customer2);
		PaymentInfo paymentinfo2 = new PaymentInfo();
		orderRequest.setPaymentinfo(paymentinfo2);
		
		Order order2 = orderService.buyBooks(orderRequest2);
		System.out.println("Order Details: \n " + "Order ID:" + order2.getOrderID() + "\n Book ID:"
				 + order2.getBookID() + "\n Status:" +order2.getStatus());
	
		OrderRequest orderRequest3 = new OrderRequest();
		orderRequest3.setOrderId("463");
		System.out.println("The Status of your Order is:" + orderService.getOrderStatus(orderRequest3));
		
		CustomerRequest customerRequest = new CustomerRequest();
		customerRequest.setOrderID("567");
		Customer cust = orderService.getCustomerInfo(customerRequest);
		System.out.println("Customer Details for Order Id:  " +customerRequest.getOrderID() + "\n  Name:" + cust.getName() + "\n Phone:" + cust.getPhone() +
				"\n Customer ID:" + customer2.getCustId() 
				+ " ' " + "\n" + "Customer Address:" + cust.getAddress());

		PaymentInfoRequest paymentinfoRequest = new PaymentInfoRequest();
		paymentinfoRequest.setOrderId("567");
		PaymentInfo p2 = orderService
				.getPaymentInfo(paymentinfoRequest);
		System.out.println("The Payment Info is: \n" + "Card Type:" + p2.getCardType() + "\n Card Number:"
				+ p2.getCardNumber() );

		System.exit(0);
	}
}

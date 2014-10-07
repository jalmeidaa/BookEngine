package com.bookengine.ws;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OrderDAO {

	private List<Order> orders = new ArrayList<Order>();


	public OrderDAO() {
//		order.setOrderID("567");
//		order.setBookID("3");
//		Set status = new HashSet();
//		status.add("Ordered");
//		order.setStatus(status);
	}
	
	public Order buyBooks(Order order)
	{
		orders.add(order);
		return order;
	}

	public Order getOrder(String orderID) {
		for (Order order : orders) {
			if (order.getOrderID().equals(orderID))
				return order;
		}
		return null;
	}
	
	

	public String getOrderStatus(String orderID) {
		for (Order order : orders) {
			if (order.getOrderID().equals(orderID))
				return order.getStatus();
		}
		return null;
	}
	
	public Customer getCustomerInfo(String orderID) {
		for (Order order : orders) {
			if (order.getOrderID().equals(orderID))
				return order.getCustomer();
		}
		return null;
	}
}

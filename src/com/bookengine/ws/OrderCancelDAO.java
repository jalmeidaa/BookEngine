package com.bookengine.ws;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OrderCancelDAO {

	
	private List<OrderCancel> orderCancels = new ArrayList<OrderCancel>();

	public OrderCancelDAO() {
		
		OrderCancel orderCancel1 = new OrderCancel("567", "Shipped");
		OrderCancel orderCancel2 = new OrderCancel("456", "Ordered");
		OrderCancel orderCancel3 = new OrderCancel("678", "In-process");
		
		orderCancels.add(orderCancel1);
		orderCancels.add(orderCancel2);
		orderCancels.add(orderCancel3);
		
		
	}

	public OrderCancel getOrder(String orderID) {
		for (OrderCancel orderCancel : orderCancels) {
			if (orderCancel.getOrderID().equals(orderID))
				return orderCancel;
		}
		return null;
	}
	

	public OrderCancel cancelOrder(String orderID){	
		for (OrderCancel orderCancel : orderCancels) {
			if (orderCancel.getOrderID().equals(orderID))
			{   
				if(orderCancel.getStatus().equals("Shipped"))
				{
					System.out.println("Your Order has been Shipped it cannot be cancelled");
					return orderCancel;
				}
				  
				else{
					System.out.println("Your Order has been cancelled");
			        orderCancel.setStatus("Cancelled");
			        return orderCancel;
				}
				
		     }
		}
			return null;
	}
}

package com.bachelorpreof.SOA.webshop.service;

import java.util.List;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.bachelorpreof.SOA.webshop.entity.Order;
import com.bachelorpreof.SOA.webshop.repository.OrderRepository;

@Service
public class OrderService {

	private final OrderRepository orderRepository;
	
	public OrderService(
			OrderRepository orderRepository
	) {
		this.orderRepository = orderRepository;
	}
	
	public List<Order> getOrders() {
		return orderRepository.getOrders();
	}
	
	public Order getOrderById(int orderID) {
		return orderRepository.getOrderById(orderID);
	}
	
	public void postOrder(String orderString) {
		JSONObject json = new JSONObject(orderString);
		JSONObject order = json.getJSONObject("order");
		int orderID= order.getInt("orderid");
		double orderPrice = order.getDouble("orderprice");
		int inventoryID = order.getInt("inventoryid");
		int quantity = order.getInt("quantity");
		String username = order.getString("username");
		int transportID = order.getInt("transportid");
		
		Order registered = new Order();
		registered.setOrderID(orderID);
		registered.setOrderPrice(orderPrice);
		registered.setInventoryID(inventoryID);
		registered.setQuantity(quantity);
		registered.setUsername(username);
		registered.setTransportID(transportID);
		
		orderRepository.postOrder(registered);
	}
}

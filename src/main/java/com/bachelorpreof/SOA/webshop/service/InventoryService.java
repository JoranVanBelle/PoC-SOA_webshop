package com.bachelorpreof.SOA.webshop.service;

import java.util.List;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.bachelorpreof.SOA.webshop.entity.Inventory;
import com.bachelorpreof.SOA.webshop.repository.InventoryRepository;

@Service
public class InventoryService {

	private final InventoryRepository inventoryRepository;
	
	public InventoryService(
			InventoryRepository inventoryRepository
	) {
		this.inventoryRepository = inventoryRepository;
	}
	
	public List<Inventory> getInventories() {
		return inventoryRepository.getInventories();
	}
	
	public Inventory getInventoryById(int productID) {
		return inventoryRepository.getInventoryById(productID);
	}
	
	public void postInventory(String inventoryString) {
		JSONObject json = new JSONObject(inventoryString);
		JSONObject inventory = json.getJSONObject("inventory");
		int productID= inventory.getInt("productid");
		String productname = inventory.getString("productname");
		int quantity = inventory.getInt("quantity");
		long timestamp = System.currentTimeMillis();
		
		Inventory inv = new Inventory();
		inv.setProductID(productID);
		inv.setProductname(productname);
		inv.setQuantity(quantity);
		inventoryRepository.postInventory(inv);
	}
}

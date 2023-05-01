package com.bachelorpreof.SOA.webshop.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bachelorpreof.SOA.webshop.entity.Inventory;
import com.bachelorpreof.SOA.webshop.service.InventoryService;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

	private final InventoryService inventoryService;
	
	public InventoryController(InventoryService inventoryService) {
		this.inventoryService = inventoryService;
	}
	
	@GetMapping("")
	public List<Inventory> getInventories() {
		return inventoryService.getInventories();
	}
	
	@GetMapping("/{productID}")
	public Inventory getInventoryById(@PathVariable int productID) {
		return inventoryService.getInventoryById(productID);
	}
	
	@PostMapping("")
	public void postInventory(@RequestBody String body) {
		inventoryService.postInventory(body);
	}
}

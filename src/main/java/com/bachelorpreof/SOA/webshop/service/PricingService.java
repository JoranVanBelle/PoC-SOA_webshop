package com.bachelorpreof.SOA.webshop.service;

import java.util.List;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.bachelorpreof.SOA.webshop.entity.Pricing;
import com.bachelorpreof.SOA.webshop.repository.PricingRepository;

@Service
public class PricingService {
	
	private final PricingRepository pricingRepository;
	
	public PricingService(
			PricingRepository pricingRepository
	) {
		this.pricingRepository = pricingRepository;
	}
	
	public List<Pricing> getPricings() {
		return pricingRepository.getPricings();
	}
	
	public Pricing getPricingById(int productID) {
		return pricingRepository.getPricingById(productID);
	}
	
	public void postPricing(String pricingString) {
		JSONObject json = new JSONObject(pricingString);
		JSONObject inventory = json.getJSONObject("pricing");
		int productID= inventory.getInt("productid");
		String productname = inventory.getString("productname");
		double price = inventory.getInt("price");
		
		Pricing pricing = new Pricing();
		pricing.setProductID(productID);
		pricing.setProductname(productname);
		pricing.setPrice(price);
		
		pricingRepository.postPricing(pricing);
	}
}

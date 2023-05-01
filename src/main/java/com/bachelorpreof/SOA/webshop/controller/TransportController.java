package com.bachelorpreof.SOA.webshop.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bachelorpreof.SOA.webshop.entity.Transport;
import com.bachelorpreof.SOA.webshop.service.TransportService;

@RestController
@RequestMapping("/transport")
public class TransportController {

	private final TransportService transportService;
	
	public TransportController(TransportService transportService) {
		this.transportService = transportService;
	}
	
	@GetMapping("")
	public List<Transport> getTransports() {
		return transportService.getTransports();
	}
	
	@GetMapping("/{transportID}")
	public Transport getTransportById(@PathVariable int transportID) {
		return transportService.getTransportById(transportID);
	}
	
	@PostMapping("")
	public void postTransport(@RequestBody String body) {
		transportService.postTransport(body);
	}	
}

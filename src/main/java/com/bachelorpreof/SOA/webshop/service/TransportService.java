package com.bachelorpreof.SOA.webshop.service;

import java.util.List;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.bachelorpreof.SOA.webshop.entity.Transport;
import com.bachelorpreof.SOA.webshop.repository.TransportRepository;

@Service
public class TransportService {

	private final TransportRepository transportRepository;
	
	public TransportService(
			TransportRepository transportRepository
	) {
		this.transportRepository = transportRepository;
	}
	
	public List<Transport> getTransports() {
		return transportRepository.getTransport();
	}
	
	public Transport getTransportById(int transportID) {
		return transportRepository.getTransportById(transportID);
	}
	
	public void postTransport(String transportString) {
		JSONObject json = new JSONObject(transportString);
		JSONObject transport = json.getJSONObject("transport");
		int transportID= transport.getInt("transportid");
		String transportname = transport.getString("transportname");
		
		Transport trans = new Transport();
		trans.setTransportID(transportID);
		trans.setTransportname(transportname);
		
		transportRepository.postTransport(trans);
	}
}

package com.api.address.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.address.entities.Address;
import com.api.address.services.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	
	// Post add address
	@PostMapping
	public Address createAddress(@RequestBody Address address) {
	//	System.out.print(address.toString());
		Address saveAddress = addressService.saveAddress(address);
		return saveAddress;
	}

}

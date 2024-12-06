package com.api.address.services;

import java.util.List;

import com.api.address.entities.Address;

public interface AddressService {
	
	// Post add
	Address saveAddress(Address address);
	
	// Get ById
	Address getAddresById(int id);
	
	// Get All User
	List<Address> getAllAddresses();

//	// Put ById
//	Address updateAddress(int id, Address address);
//	
//	// Delete ById
//	String deleteAddress(int id);
}

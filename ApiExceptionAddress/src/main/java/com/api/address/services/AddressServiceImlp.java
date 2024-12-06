package com.api.address.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.address.dao.AddressRepository;
import com.api.address.entities.Address;

@Service
public class AddressServiceImlp implements AddressService{
	
	@Autowired
	private AddressRepository addressRepository;

	@Override
	public Address saveAddress(Address address) {
		Address save = addressRepository.save(address);
		return save;
	}

	@Override
	public Address getAddresById(int id) {
		Address orElseThrow = addressRepository.findById(id).orElseThrow(()-> new RuntimeException("Address Not Found"+id));
		return orElseThrow;
	}

	@Override
	public List<Address> getAllAddresses() {
		Iterable<Address> findAll = addressRepository.findAll();
		return (List<Address>) findAll;
	}


}

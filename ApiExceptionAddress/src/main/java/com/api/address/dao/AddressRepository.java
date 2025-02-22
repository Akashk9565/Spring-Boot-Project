package com.api.address.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.api.address.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>{

}

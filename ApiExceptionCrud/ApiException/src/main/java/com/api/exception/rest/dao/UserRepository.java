package com.api.exception.rest.dao;

import org.springframework.data.repository.CrudRepository;

import com.api.exception.rest.entities.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}

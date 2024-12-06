package com.crud.service;

import java.util.List;

import com.crud.entities.User;

public interface UserService {
	
	User saveUser(User user);
	User getByid(int id);
	List<User> getAllUser();
	User updateUser(int id, User user);
	String deleteUser(int id);

}

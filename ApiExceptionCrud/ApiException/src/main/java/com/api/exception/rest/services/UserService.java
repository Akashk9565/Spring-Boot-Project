package com.api.exception.rest.services;

import java.util.List;

import com.api.exception.rest.entities.User;

public interface UserService {

	// post
	User saveUser(User user);

	// Get ById
	User getUserById(int id);

	// Get All user
	List<User> getAllUser();

	// Put ById
	User updateUser(int id, User user);

	// Delete ById
	String deleteUser(int id);
}

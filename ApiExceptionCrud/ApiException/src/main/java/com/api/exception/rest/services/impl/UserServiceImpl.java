package com.api.exception.rest.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.exception.exceptions.ResourceNotFoundException;
import com.api.exception.rest.dao.UserRepository;
import com.api.exception.rest.entities.User;
import com.api.exception.rest.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		User save = userRepository.save(user);
		return save;
	}

	@Override
	public User getUserById(int id) {
		User user = userRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("user not found "+id));
		return user;
	}

	@Override
	public List<User> getAllUser() {
		Iterable<User> findAll = userRepository.findAll();
		return (List<User>) findAll;

	}

	@Override
	public User updateUser(int id, User user) {
			
		User curreUser = userRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("User not found: "+ id));
		curreUser.setName(user.getName());
		curreUser.setEmail(user.getEmail());
		User updatedUser = userRepository.save(curreUser);
		return updatedUser;
	}

	@Override
	public String deleteUser(int id) {
		User curreUser = userRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("User not found: "+ id));
		userRepository.delete(curreUser);
		return "User deleted sucessfully...!!";
	}
 
}

package com.api.exception.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.api.exception.rest.entities.User;
import com.api.exception.rest.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	// create / save user 
	
	@PostMapping
	public User create(@RequestBody User user) {
		User saveUser = userService.saveUser(user);
		return saveUser;
	}
	
	// Get All User
//	@GetMapping
//	public List<User> getAllUser() {
//		List<User> allUser = userService.getAllUser();
//		return allUser;
//	}
	
	@GetMapping
	public ResponseEntity<List<User>> getAllUser() {
		List<User> allUser = userService.getAllUser();
		return (ResponseEntity<List<User>>) ResponseEntity.ok(allUser);
	}
	
	// Get ById 
//	@GetMapping("/{id}")
//	public User getById(@PathVariable("id") int id) {
//		User userById = userService.getUserById(id);
//		return userById;
//	}
	
	@GetMapping("/{id}")
	public ResponseEntity<User> getById(@PathVariable("id") int id) {
		User userById = userService.getUserById(id);
		return ResponseEntity.ok(userById);
	}
	
	// Update ById
	@PutMapping("/{id}")
	public User updateById(@RequestBody User user, @PathVariable("id") int id) {
		User updateUser = userService.updateUser(id, user);
		return updateUser;
	}
	
	// Delete ById
//	@DeleteMapping("/{id}")
//	public String deleteById(@PathVariable("id") int id) {
//		String deleteUser = userService.deleteUser(id);
//		return deleteUser;
//	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteById(@PathVariable("id") int id) {
		String deleteUser = userService.deleteUser(id);
		return new ResponseEntity<String>(deleteUser, HttpStatus.OK);
	}

}

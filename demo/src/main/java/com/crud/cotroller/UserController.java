package com.crud.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entities.User;
import com.crud.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	//Post 
	@PostMapping
	User createUser(@RequestBody User user) {
		User saveUser = userService.saveUser(user);
		return saveUser;
		
	}
	
	// Get AllUser
	@GetMapping
	List<User> getAllUser() {
		List<User> allUser = userService.getAllUser();
		return allUser;
	}
	
	// get ById
	@GetMapping("/{id}")
	User getById(@PathVariable("id") int id) {
		User byid = userService.getByid(id);
		return byid;
	}
	
	// put update
	@PutMapping("/{id}")
	User upateUser(@RequestBody User user, @PathVariable("id") int id) {
		User updateUser = userService.updateUser(id, user);
		return updateUser;
	}
	
	// delete user ById
	@DeleteMapping("/{id}")
	String deleteById(@PathVariable("id") int id) {
		String deleteUser = userService.deleteUser(id);
		return deleteUser;
	}
	

}

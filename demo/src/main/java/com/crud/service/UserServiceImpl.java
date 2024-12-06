package com.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.dao.UserRepository;
import com.crud.entities.Quote;
import com.crud.entities.User;

@Service
public class QuoteServiceImpl implements UserService{
	
	@Autowired
	private QuoteRepository quoteRepository;

	@Override
	public Quote saveUser(Quote quote) {
		User save = quoteRepository.save(quote);
		return save;
	}

	@Override
	public User getByid(int id) {
		User user = userRepository.findById(id).orElseThrow(()-> new RuntimeException("User Not Found"+id));
		return user;
	}

	@Override
	public List<User> getAllUser() {
		Iterable<User> findAll = userRepository.findAll();
		return (List<User>) findAll;
	}

	@Override
	public User updateUser(int id, User user) {
		User current = userRepository.findById(id).orElseThrow(()-> new RuntimeException("User Not Found"+id));
		current.setName(user.getName());
		current.setPassword(user.getPassword());
		User save = userRepository.save(current);
		return save;
	}

	@Override
	public String deleteUser(int id) {
		User currentUser = userRepository.findById(id).orElseThrow(()-> new RuntimeException("User Not Found"+id));
		userRepository.delete(currentUser);
		return "Successfully deleted......";
	}

}

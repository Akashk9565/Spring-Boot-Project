package com.restapibook.dao;

import org.springframework.data.repository.CrudRepository;

import com.restapibook.entities.Books;

public interface BooksRepository extends CrudRepository<Books, Integer> {
	
	public Books findById(int id);

}

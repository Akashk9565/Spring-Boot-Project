package com.restapibook.controller;

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

import com.restapibook.entities.Books;
import com.restapibook.services.BookService;

@RestController
public class BookController {

	@Autowired
	BookService bookservice;
	
	// Get All Books
	@RequestMapping("/books")
	public List<Books> getbook() {
		
		return this.bookservice.getAllBook();
	}
	
	// Get Bookd ById handler
	
	@GetMapping("/books/{id}")
	public Books getBokks(@PathVariable("id") int id) {
		
		return bookservice.getBookByid(id);
		
	}
	
	// Add Books handler
	
	@PostMapping("/books")
	public Books addBook(@RequestBody Books book) {
		
		Books b= bookservice.addBook(book);
		return b;
		
	}
	
	// delete book by id handler
	
	@DeleteMapping("/books/{id}")
	public void deleteBook(@PathVariable("id") int id) {
		this.bookservice.deletBook(id);
	}
	
	// Update Book Handler
	@PutMapping("/books/{id}")
	public Books updateBook(@RequestBody Books book, @PathVariable("id") int id) {
		this.bookservice.updateBook(book, id);
		return book;
	}
	
}

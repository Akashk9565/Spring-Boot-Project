package com.restapibook.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.restapibook.entities.Books;

@Component
public class BookService {
	
	private static List<Books> list = new ArrayList<>();
	
	static {
		list.add(new Books(1001,"Java is complete book","xyz"));
		list.add(new Books(1002,"Python is complete book","abc"));
		list.add(new Books(1003,"NodeJs is complete book","app"));


	}
	
	// get all books
	
	public List<Books> getAllBook(){
		
		return list;
	}
	
	// get single books by Id
	
	public Books getBookByid(int id){
		
		Books book = null;
		book = list.stream().filter(e->e.getId()==id).findFirst().get();
		return book;
	}
	
	// Adding the books
	
	public Books addBook(Books b) {
		list.add(b);
		return b;
	}
	
	// delete book
	
	public void deletBook(int id) {
		list.stream().filter(e->e.getId()!=id).collect(Collectors.toList());
	}

	// update book by id 
	public void updateBook(Books book, int id) {
		list= list.stream().map(e->{
			if(e.getId()==id) {
				e.setTitle(book.getTitle());
				e.setAuthor(book.getAuthor());
			}
			return e;
		}).collect(Collectors.toList());
	}

}

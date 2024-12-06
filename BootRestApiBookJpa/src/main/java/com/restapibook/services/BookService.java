package com.restapibook.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.restapibook.dao.BooksRepository;
import com.restapibook.entities.Books;

@Component
public class BookService {
	
	@Autowired
	private BooksRepository booksRepository;
	
	// get all books
	
	public List<Books> getAllBook(){
		List<Books> list=(List<Books>)this.booksRepository.findAll();
		return list;
	}
	
	// get single books by Id
	
	public Books getBookByid(int id){
		
		Books book = null;
		book=this.booksRepository.findById(id);
		return book;
	}
	
	// Adding the books
	
	public Books addBook(Books b) {
		Books book=booksRepository.save(b);
		return book;
	}
	
	// delete book
	
	public void deletBook(int id) {
		
		booksRepository.deleteById(id);
	}

	// update book by id 
	public void updateBook(Books book, int id) {
		book.setId(id);
		booksRepository.save(book);
	}

}

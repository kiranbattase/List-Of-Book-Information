package com.boot.project.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.boot.project.exceptions.DuplicateBookException;
import com.boot.project.model.Book;
import com.boot.project.service.BookService;

@Service
public class BookServiceImpl implements BookService{

public static List<Book> books = new ArrayList<Book>();
	
	static {
		books.add(new Book(1001,"Spring","(Rod Johnson, Juergen Hoeller, and Yann Caroff)"));
		books.add(new Book(1002,"SpringBoot","Rod Johnsons"));
		books.add(new Book(1003,"MicroServices","Dr. Peter Rodgers"));
	}
	
	public List<Book> getbooks () {
		return books;
	}
	
	public boolean savebookData(Book book) throws DuplicateBookException {
		Optional<Book> existingBook = books.stream()
								 .filter(b->b.getIsbn().equals(book.getIsbn()))
								 .findFirst();
		if (existingBook.isPresent()) {
			//throw new DuplicateBookException("Book Already Present check Once...");
			
			throw new DuplicateBookException(existingBook);
		}
		
		
		return books.add(book);
	}

	public boolean deleteBookData(Integer isbn) {

	Book book = books.stream()
						.filter(b->b.getIsbn().equals(isbn))
						.findFirst()
						.get();
	return books.remove(book);
	}

	public Book editBook(Integer isbn) {
		  Book book = books.stream()
					  .filter(b->b.getIsbn().equals(isbn))
					  .findFirst()
					  .get();
		  
		  return book;
		
	}

	public Book editBookSave(Book editbook) {
		Book existingbook = books.stream()
					.filter(b->b.getIsbn().equals(editbook.getIsbn()))
					.findFirst()
					.get();
		if (existingbook !=null) {
			existingbook.setName(editbook.getName());
			existingbook.setAuthor(editbook.getAuthor());
		}
		
		return existingbook;
	}


}

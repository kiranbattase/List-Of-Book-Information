package com.boot.project.exceptions;

import java.util.Optional;

import com.boot.project.model.Book;

public class DuplicateBookException extends Exception {

	Book book;
	public DuplicateBookException(String msg) {
		super(msg);
		
	}

	public DuplicateBookException(Optional<Book> existingBook) {
		
		book = existingBook.get();
	}
	
	public Book getBook() {
		return book;
	}
}

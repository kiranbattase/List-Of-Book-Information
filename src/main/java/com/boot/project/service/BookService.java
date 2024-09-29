package com.boot.project.service;

import java.util.List;

import com.boot.project.exceptions.DuplicateBookException;
import com.boot.project.model.Book;


public interface BookService {
		
	public List<Book> getbooks () ;
	
	public boolean savebookData(Book book) throws DuplicateBookException ;

	public boolean deleteBookData(Integer isbn) ;

	public Book editBook(Integer isbn) ;

	public Book editBookSave(Book editbook) ;
	
}

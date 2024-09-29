package com.boot.project.aop;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.boot.project.exceptions.DuplicateBookException;
import com.boot.project.model.Book;

@ControllerAdvice
public class BookControllerAdvice {

	@ExceptionHandler(value = DuplicateBookException.class)
	public String duplicateExceptionHandling (DuplicateBookException exception,Model model) {
		
		Book book = exception.getBook();
		
		model.addAttribute("book",book);
		model.addAttribute("message","I can handled DuplicateBookException easily....");
		return "error-page";
	}
}

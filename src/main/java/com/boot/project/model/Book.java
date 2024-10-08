package com.boot.project.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	
	@NotNull(message = "ISBN can not be null")
	private Integer isbn;
	
	@NotNull(message = "Book Name Required")
	private String name;
	
	@NotNull(message = "Book Author Required")
	@Size(min = 5,max = 100,message = "Author name between 5 to 100 characters")
	private String author;
}

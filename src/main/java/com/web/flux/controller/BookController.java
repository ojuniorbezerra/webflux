package com.web.flux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.web.flux.document.Book;
import com.web.flux.service.BookService;

import reactor.core.publisher.Mono;

@RestController
public class BookController {

	private BookService bookService;
	
	
	@Autowired
	public BookController(BookService bookService) {
		super();
		this.bookService = bookService;
	}



	@GetMapping("/produto/{id}")
	public Mono<Book> getByCode(@PathVariable final String code) {
		return bookService.findByCode(code);
	}
}

package com.web.flux.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.flux.document.Book;
import com.web.flux.gateway.BookGateway;

import reactor.core.publisher.Mono;

@Service
public class BookService {

	private BookGateway bookGateway;

	@Autowired
	public BookService(BookGateway bookGateway) {
		super();
		this.bookGateway = bookGateway;
	}

	public Mono<Book> findByCode(String code) {
		return bookGateway.findById(code);
	}
	
}

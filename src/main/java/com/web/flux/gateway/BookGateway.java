package com.web.flux.gateway;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.web.flux.document.Book;

public interface BookGateway extends ReactiveCrudRepository<Book, String> {

}

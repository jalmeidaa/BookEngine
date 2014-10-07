package com.bookengine.ws.service;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.bookengine.ws.Book;
import com.bookengine.ws.service.request.SearchRequest;

@WebService
public interface BookService {
	@WebResult(targetNamespace = "", name = "Book")
	public List<Book> searchAllBooks();

	public Book searchId(
			@WebParam(name = "SearchRequest") SearchRequest searchRequest);

	public Book searchAuthor(
			@WebParam(name = "SearchRequest") SearchRequest searchRequest);

	public Book searchBookname(
			@WebParam(name = "SearchRequest") SearchRequest searchRequest);

}

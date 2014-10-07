package com.bookengine.ws.service;

import java.util.List;

import javax.jws.WebService;

import com.bookengine.ws.Book;
import com.bookengine.ws.BookDAO;
import com.bookengine.ws.service.request.SearchRequest;

@WebService(endpointInterface = "com.bookengine.ws.service.BookService", serviceName = "BookServices")
public class BookServiceImpl implements BookService {

	BookDAO bookDAO = new BookDAO();

	public List<Book> searchAllBooks() {
		return bookDAO.searchAllBooks();
	}

	public Book searchId(SearchRequest searchRequest) {
		return bookDAO.searchId(searchRequest.getBookID());
	}

	public Book searchAuthor(SearchRequest searchRequest) {
		return bookDAO.searchAuthor(searchRequest.getAuthorName());
	}

	public Book searchBookname(SearchRequest searchRequest) {
		return bookDAO.searchBookname(searchRequest.getBookName());
	}

}

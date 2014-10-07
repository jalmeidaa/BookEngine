package com.bookengine.ws;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

	private List<Book> books = new ArrayList<Book>();

	public BookDAO() {
	
			Book book1 = new Book("1","Web Services","Kanika","567-789");
			Book book2= new Book("2","XML Programming","Julius","7890-567");
			Book book3= new Book("3","Database Programming","Yang","234-890");
			
			books.add(book1);
			books.add(book2);
			books.add(book3);
			
		}
	

	public List<Book> searchAllBooks() {
		return books;
	}

	public Book searchId(String id) {
		for (Book book : books) {
			if (book.getBookId().equals(id))
				return book;
		}
		return null;
	}

	public Book searchAuthor(String author) {
		for (Book book : books) {
			if (book.getAuthorName().equals(author))
				return book;
		}
		return null;
	}

	public Book searchBookname(String name) {
		for (Book book : books) {
			if (book.getBookName().equals(name))
				return book;
		}
	return null;
	}
	
}

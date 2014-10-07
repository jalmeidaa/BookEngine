package com.bookengine.ws.client;

import java.util.List;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.bookengine.ws.Book;
import com.bookengine.ws.service.BookService;
import com.bookengine.ws.service.request.SearchRequest;

public class BookServiceClient {

	private BookServiceClient() {
	}

	public static void main(String args[]) throws Exception {

		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

		factory.getInInterceptors().add(new LoggingInInterceptor());
		factory.getOutInterceptors().add(new LoggingOutInterceptor());
		factory.setBindingId("http://cxf.apache.org/bindings/xformat");
		
		factory.setServiceClass(BookService.class);
		factory.setAddress("http://localhost:8080/BookEngine/services/cxfBookService");
		BookService client = (BookService) factory.create();

		// search all books

		SearchRequest searchrequest = new SearchRequest();
		SearchRequest searchrequest2 = new SearchRequest();
		SearchRequest searchrequest3 = new SearchRequest();
		
		searchrequest.setBookID("3");
		searchrequest2.setBookName("Web Services");
		searchrequest3.setAuthorName("Julius");
		
      	List<Book> books = client.searchAllBooks();
      	  System.out.println("List of all available books:");
          for (Book book : books) {
        	System.out.println("Book Name: " + book.getBookName());
 	 	    System.out.println("Book Author: " + book.getAuthorName());
			System.out.println("Book ISBN: " + book.getIsbn() + "\n");
   		}
		
		    Book bookid = client.searchId(searchrequest);
		    System.out.println("Searching book by BookID:" +bookid.getBookId());
			System.out.println("Book Name: " + bookid.getBookName());
			System.out.println("Book Author: " + bookid.getAuthorName());
			System.out.println("Book ISBN: " + bookid.getIsbn() + "\n");
			
 		     Book bookname = client.searchBookname(searchrequest2);
 		    System.out.println("Searching book by Book Name:" +bookid.getBookName());
	         System.out.println("Book ID: " + bookname.getBookId());
			 System.out.println("Book Author: " + bookname.getAuthorName());
			 System.out.println("Book ISBN: " + bookname.getIsbn() + "\n");
  		
			Book bookauthor = client.searchAuthor(searchrequest3);
			 System.out.println("Searching book by Author Name:" +bookid.getAuthorName());
			System.out.println("Book ID: " + bookauthor.getBookId());
			System.out.println("Book Name: " + bookauthor.getBookName());
			System.out.println("Book ISBN: " + bookauthor.getIsbn() + "\n");
		

		System.exit(0);
	}

}

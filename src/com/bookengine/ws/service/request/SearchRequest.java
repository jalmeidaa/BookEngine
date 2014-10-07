package com.bookengine.ws.service.request;

public class SearchRequest {
	private String bookId;
	private String iSBN;
	private String bookName;
	private String authorName;
	
	public SearchRequest(){
		
	}
	public String getBookID() {
		return bookId;
	}
	public void setBookID(String bookId) {
		this.bookId = bookId;
	}
	public String getIsbn() {
		return iSBN;
	}
	public void setIsbn(String iSBN) {
		this.iSBN = iSBN;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	
}

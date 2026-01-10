package com.bookshelf;

class Book {
	private String title;
	private String author;
	
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	
	public String toString() {
		return title + " by " + author;
	}

}

package com.constructor.level1;

public class BookOne {

	 // Public variable - accessible everywhere
	 public String ISBN;

	 // Protected variable - accessible in subclass
	 protected String title;

	 // Private variable - accessible only inside this class
	 private String author;

	 // Constructor
	 public BookOne(String ISBN, String title, String author) {
	     this.ISBN = ISBN;
	     this.title = title;
	     this.author = author;
	 }

	 // Setter for author
	 public void setAuthor(String author) {
	     this.author = author;
	 }

	 // Getter for author
	 public String getAuthor() {
	     return author;
	 }
	}

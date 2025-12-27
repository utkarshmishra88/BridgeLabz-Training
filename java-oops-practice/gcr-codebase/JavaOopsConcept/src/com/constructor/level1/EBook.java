package com.constructor.level1;

public class EBook extends BookOne {

	 private double fileSizeMB;

	 // Constructor
	 public EBook(String ISBN, String title, String author, double fileSizeMB) {
	     super(ISBN, title, author);
	     this.fileSizeMB = fileSizeMB;
	 }

	 // Method to display ebook details
	 public void displayEBookDetails() {
	     System.out.println("ISBN     : " + ISBN);          // public
	     System.out.println("Title    : " + title);         // protected
	     System.out.println("Author   : " + getAuthor());   // private via getter
	     System.out.println("File Size: " + fileSizeMB + " MB");
	 }

	 // Main method
	 public static void main(String[] args) {

	     EBook ebook =
	             new EBook("978-0134685991", "Effective Java", "Joshua Bloch", 5.2);

	     ebook.displayEBookDetails();

	     // Updating author using setter
	     ebook.setAuthor("J. Bloch");

	     System.out.println("\nAfter Author Update:");
	     ebook.displayEBookDetails();
	 }
	}

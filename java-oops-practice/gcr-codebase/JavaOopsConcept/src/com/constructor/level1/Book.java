package com.constructor.level1;

public class Book {
	//Attributes  
		private String title;
		private String author;
		private double price;
		
		//default constructor
		public Book() {
			this.title="7States";
			this.author="Vishal";
			this.price=199.00;
		}
		
		//parameterized constructor
		public Book(String title, String author, double price) {
			this.title=title;
			this.author=author;
			this.price=price;
		}
		
		//display the result
		void display() {
			System.out.println("Title: "+this.title);
			System.out.println("Author: "+this.author);
			System.out.println("Price: "+this.price);
			System.out.println();
		}
}

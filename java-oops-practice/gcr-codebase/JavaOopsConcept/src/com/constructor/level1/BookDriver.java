package com.constructor.level1;

public class BookDriver {

	public static void main(String[] args) {
		//initialize default constructor
		Book book1=new Book();
		book1.display();
			
		//initialize and passing parameters in parameterized constructor
		Book book2=new Book("Computer","Hemant",1299.0);
		book2.display();
	}

}

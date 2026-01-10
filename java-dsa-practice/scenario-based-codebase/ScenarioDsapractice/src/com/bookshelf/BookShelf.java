package com.bookshelf;
import java.util.Scanner;
public class BookShelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		Library library=new Library();
		
		System.out.println("Enter number of Books :");
		int n=sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<n;i++) {
			System.out.print("Enter genre :");
			String genre=sc.nextLine();
			
			System.out.print("Enter title :");
			String title=sc.nextLine();
			
			System.out.print("Enter author :");
			String author=sc.nextLine();
			
			library.addBook(genre, new Book(title,author));
		}
		
		
		System.out.println("Display catalog :");
		library.displayCatalog();
		
		System.out.println("Enter genre to borrow a book :");
		String genre=sc.nextLine();
		
		library.borrowBook(genre);
		
		System.out.println("Display catalog :");
		library.displayCatalog();
		
	}

}

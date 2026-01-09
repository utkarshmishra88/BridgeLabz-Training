package com.artify;

public abstract class ArtWork {
	 private String title;
	 private String artist;
	 private double price;
	 protected String licenseType;
	 
	 // Parameterised constructor
	 ArtWork(String title, String artist,  double price, String licenseType){
		 this.title=title;
		 this.price=price;
		 this.artist=artist;
		 this.licenseType=licenseType;
	 }
    
	 // Default constructor
	 ArtWork(){
		 
	 }
	 
	public  double getPrice()
	 {
		return price;
		 
	 }
	
	public String getTitle()
	{
		return title;
	}
	
	public void license()
	{
		
	}
	public void purchase(User user) {
		if(user.getWalletBalance() >= price) {
			user.deductBalance(price);
			System.out.println(user.getName() + " purchased \"" + title + "\" for ₹" + price);
            license();
			
		}
		else {
            System.out.println("Purchase failed: Insufficient balance");
        }
		
	}
}

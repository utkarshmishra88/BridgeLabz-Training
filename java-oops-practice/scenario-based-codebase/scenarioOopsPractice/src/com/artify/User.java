package com.artify;

public class User {
  private String name;
  private double walletBalance;
  
  User(String name, double walletBalance){
	  this.name=name;
	  this.walletBalance=walletBalance;
  }
  
  public double getWalletBalance() {
	  return walletBalance;
  }
  
  public void deductBalance(double amount) {
	 
	  if(walletBalance >= amount) {
		  walletBalance = walletBalance-amount;
	 }
	  else {
		  System.out.println("Insufficient balance!"); 
	  }
	  
  }
   
  public String getName() {
	  return name;
  }
}

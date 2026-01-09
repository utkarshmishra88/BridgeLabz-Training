package com.artify;

public class PrintArt extends ArtWork {
	private String printSize;
	
	PrintArt(String title, String artist, double price, String licenseType, String printSize){
		super(title,artist,price,licenseType);
		this.printSize=printSize;
	}
	
	public void license() {
		System.out.println("Print License Applied: " + licenseType);
        System.out.println("Usage: Physical Prints only:"+printSize);
	}

}

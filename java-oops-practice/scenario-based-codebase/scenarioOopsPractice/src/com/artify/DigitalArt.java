package com.artify;

public class DigitalArt extends ArtWork {
	private String previewURL;
	
	public DigitalArt(String title, String artist,double price,  String licenseType){
		super(title,artist,price,licenseType);
		
	}
	
	public DigitalArt(String title, String artist,double price,  String licenseType, String previewURL) {
		super(title,artist,price,licenseType);
		this.previewURL=previewURL;
	}
	
	public void license() {
		System.out.println("Digital License Applied: " + licenseType);
        System.out.println("Usage: Online & Commercial use allowed.");
	}
}

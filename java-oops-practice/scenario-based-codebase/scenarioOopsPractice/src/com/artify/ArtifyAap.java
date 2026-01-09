package com.artify;

public class ArtifyAap {
	public static void main(String[] args) {
		User user=new User("Kumkum", 500000);
		
		ArtWork art1 = new DigitalArt(
                "Cyber Dreams", "Alex", 1500,
                "Standard Digital License", "preview.jpg");
		
		ArtWork art2 = new PrintArt(
                "Nature Bliss", "Emma", 2000,
                "Print Only License", "A3");
		
		ArtWork art3 = new DigitalArt(
                "Neon City", "Ryan", 1800,
                "Premium Digital License", "preview2.jpg");
		
		ArtWork art4 = new PrintArt(
                "Mountain Peace", "Sophia", 2200,
                "Limited Print License", "A2");
		
		
		ArtWork artworks[] = {art1, art2, art3, art4};
		for(ArtWork art : artworks) {
			art.purchase(user);
			System.out.println("Remaining Wallet Balance: ₹" 
                                + user.getWalletBalance());
			System.out.println("----------------------------------");
		}
	}

}

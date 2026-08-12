package com.javaintro;

public class cricketer {
	
	int jerseyname=1;
	String name = "vamshi";
	
	static int id=1;
	static String countryname ="Indian";
	

	public static void main(String[] args) {
		System.out.println("welcome to eeeee");
		System.out.println("id :"+ id);
		System.out.println("countryname :"+ countryname);
		
		
		cricketer msd = new cricketer();
		
		msd.jerseyname = 22;
		msd.name = "vamshi";
	
		System.out.println("jerseyname :"+ msd.jerseyname);
		System.out.println("name :"+ msd.name);
		
		cricketer avr = new cricketer();
		
		avr.jerseyname = 88;
		avr.name = "fffff";

		
		System.out.println("jerseyname :"+ avr.jerseyname);
		System.out.println("name :"+ avr.name);
		
		
	}

}

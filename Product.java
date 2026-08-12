package com.javaintro;

public class Product {

	    // Instance fields
	    int productId;
	    String productName;
	    double productPrice;
	    String productInfo;

	    // Static field
	    static String companyName="ffff";

	    // Main method
	    public static void main(String[] args) {

	        Product p1 = new Product();
	        
	        p1.productId = 101;
	        p1.productName = "Laptop";
	        p1.productPrice = 55000.0;
	        p1.productInfo = "16GB RAM, 512GB SSD";
	        
            Product p2 = new Product();
            p2.companyName="ttttt";
	        p2.productId = 102;
	        p2.productName = "Laptop";
	        p2.productPrice = 25000.0;
	        p2.productInfo = "16GB RAM, 512GB SSD";
	        
	        p1.show();
	        p2.show();
	        
	    }
	    
	    void show() {
	    	System.out.println("companyName   : " + companyName);
	    	System.out.println("Product ID    : " + productId);
	        System.out.println("Product Name  : " + productName);
	        System.out.println("Product Price : " + productPrice);
	        System.out.println("Product Info  : " + productInfo);
	    }
}

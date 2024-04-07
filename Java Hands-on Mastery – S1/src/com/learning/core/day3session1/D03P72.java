package com.learning.core.day3session1;
import java.util.Scanner;
import java.util.*;
	public class D03P72{
	    public static void main(String[] args) {
	        HashSet<Product> products = new HashSet<>();
	   
	        Product product1 = new Product("P001", "Maruti 800");
	        Product product2 = new Product("P002", "Maruti Zen");
	        Product product3 = new Product("P003", "Maruti Denzire");
	        Product product4 = new Product("P004", "Maruti ALt0");
	        
	        products.add(product1);
	        products.add(product2);
	        products.add(product3);
	        products.add(product4);
	    
	        System.out.println("Product Details:");
	        for (Product product : products) {
	            System.out.println(product);
	        }
	    }
	}
	        
	    
	    
	    
	    
	    

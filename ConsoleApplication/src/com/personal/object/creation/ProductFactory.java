package com.personal.object.creation;

import java.util.ArrayList;
import java.util.List;

public class ProductFactory {
  
	private static List<Product> pLists = new ArrayList<>(3);
	private static int count = 0;
	private final static int MAX_COUNT = 3;
	private ProductFactory() {
		
	}
	
	public static Product getProduct(int id, String name) {
		Product p = null;
		if(count < MAX_COUNT) {
			p = new Product(id,name);
			pLists.add(p);
			
		}
		else {
			p = pLists.get(0); //can use java Random to get the random inex
		}
		return p;
	}
	
/*	public static Product getProduct(int id, String name) {
		return new Product(id,name);
	}*/
	
/*	public static Product getProduct(DbProduct product) {
		return new Product(id, name);
	}*/
}

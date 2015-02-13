package com.personal.object.creation;

public class ProductSingleton {

	//Eager Loading
	//private static Product INSTANCE = new Product();
	
	//Lazy loading
	private static volatile Product INSTANCE = null;
		
	/*
	public static Product getProduct() {
		if(INSTANCE == null) {
			INSTANCE = new Product();
		}
		return INSTANCE;
	}
	*/
	private ProductSingleton() {
		//
	}
	
	//Double check locking
	public static Product getProduct() {
		if(INSTANCE == null) {
			
			synchronized (ProductSingleton.class) {
				if(INSTANCE == null) {
					INSTANCE = new Product();
				}
			}
		}
		return INSTANCE;
	}
}

package com.personal.object.creation;

public class Product {

	private int id;
	
	private String name;

	Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	Product() {
		
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	
}

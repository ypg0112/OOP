package com.personal.builder;

public class Product implements Printable {

	private final int id;
	private final String name;
	private final double price;
	
	
	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public int getId() {
		return id;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public double getPrice() {
		return price;
	}
	
	
}

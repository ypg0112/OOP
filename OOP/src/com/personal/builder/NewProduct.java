package com.personal.builder;

public class NewProduct implements Printable {

	private final int id;
	private final String name;
	private final double price;
	
	private NewProduct(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.price = builder.price;
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	@Override
	public int getId() {
		return this.id;
	}
	
	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public double getPrice() {
		return this.price;
	}
	
	public static class Builder {
		private int id;
		private String name;
		private double price;
		
		private Builder() {
			
		}
		
		public Builder withId(int id) {
			this.id = id;
			return this;
		}
		
		public Builder withName(String name) {
			this.name = name;
			return this;
		}
		
		public Builder withPrice(double price) {
			this.price = price;
			return this;
		}

		public NewProduct build() {
			return new NewProduct(this);
		}
	}
	
}

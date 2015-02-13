package com.personal.builder.driver;

import com.personal.builder.NewProduct;
import com.personal.builder.Printable;
import com.personal.builder.Product;

public class BuilderMainDriver {

	public static void main(String[] args) {

		Product product = new Product(1, "Book", 100.0);
		print(product);
		
		NewProduct product2 = NewProduct.builder()
				.withId(2)
				.withName("Book 2")
				.build();
		
		
		print(product2);

		
		NewProduct.Builder builder = NewProduct.builder();
		
		builder.withId(3);
		//getdata
		builder.withName("100");
		
		print(builder.build());
		
	}
	
	private static void print(Printable product) {
		System.out.println(product.getId() + " " + product.getName() + " " + product.getPrice());
	}

}

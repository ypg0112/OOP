package com.personal.object.creation;


public class ProductSingletonDriver {
	public static void main(String[] args) {

		//code here
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Product p1 = ProductSingleton.getProduct();
				System.out.println(p1);
			}
		});
		
		thread1.start();
		Product p = ProductSingleton.getProduct();

	
		System.out.println(p);

	}

}

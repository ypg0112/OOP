package com.personal.statickeyword;

public class ObjectLevelBlockCustomer {

	private int id;
	private String name;
	
	{
		System.out.println("Creating new object  ..");
	}
	
	public ObjectLevelBlockCustomer() {
		//print();
	}

	public ObjectLevelBlockCustomer(int id, String name) {
		//print();
		this.id = id;
		this.name = name;
	}
	
	private void print() {
		System.out.print("Creating new object  ..");

	}
}

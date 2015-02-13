package com.personal.statickeyword;

public class Customer {

	private static int count;
	private String name;
	
	public Customer() {
		count++;
	}
	
	public static int getInstanceCount() {
		return count;
	}
	
}

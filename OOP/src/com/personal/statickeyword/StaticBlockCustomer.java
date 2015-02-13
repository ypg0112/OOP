package com.personal.statickeyword;

public class StaticBlockCustomer {

	public static final int MAX_COUNT = 100;
	private static int multiplier;
	private static int count;
	private String name;
	
	static {
		multiplier = 5;
		count = 10 * 5;
		//name = ""; cannot access object level instance variable/field/property.
	}
	
	public StaticBlockCustomer() {
		count++;
	}
	
	public static int getInstanceCount() {
		return count;
	}
}

package com.personal.passbyvalue.primitive;

public class PrimitiveByValue {

	public static void main(String[] args) {

		int a = 2, b = 4;
		
		System.out.println("Before swap : a = " + a + "  b = " + b);
		swapValue(a, b);
		
		System.out.println("After swap: a = " + a + "  b = " + b);

	}

	private static void swapValue(int first, int second) {
		int temp = first;
		first = second;
		second = temp;
	}
}

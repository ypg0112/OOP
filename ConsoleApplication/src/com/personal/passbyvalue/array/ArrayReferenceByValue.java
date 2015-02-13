package com.personal.passbyvalue.array;

public class ArrayReferenceByValue {

	public static void main(String[] args) {
		
		int array1[] = {2, 4};
		
		System.out.println("Before : array1 = ");
		print(array1);
		
		plus10(array1);
		
		System.out.println("After : array1 = ");
		print(array1);
		
	}

	private static void plus10(int[] first) {
		
		for(int i=0; i < first.length; i++) {
			first[i] = first[i] + 10;
		}
	}
	
	private static void print(int[] array) {
		for(int i : array) {
			System.out.println(i);
		}
	}
}

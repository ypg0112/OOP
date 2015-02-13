package com.personal.passbyvalue.array;

public class ArrayByValue {

	public static void main(String[] args) {
		
		int array1[] = {2, 4};
		int[] array2 = {3};
		
		System.out.println("Before swap : \narray1 = ");
				print(array1);
				
		System.out.println("array2 = ");
		print(array2);
		
		swapValue(array1, array2);
		
		System.out.println("After swap : \narray1 = ");
		print(array1);
		
		System.out.println("array2 = ");
		print(array2);

	}

	private static void swapValue(int[] first, int[] second) {
		int temp[] = first;
		first = second;
		second = temp;
	}
	
	private static void print(int[] array) {
		for(int i : array) {
			System.out.println(i);
		}
	}

}

package com.personal.equality;

public class EqualDriver {

	public static void main(String[] args) {
		
		String s1 = "abc";
		String s2 = "abc";
		
		String s3 = new String("abc");
		
		//Same memory location
		if(s1 == s2) {
			System.out.println("s1 == s2");
		}
		
		//Same memory location and same content
		if(s1.equals(s2)) {
			System.out.println("s1.equals(s2)");
		}
		
		//different memory location
		if(s2 == s3) {
			System.out.println("s2 == s3");
		}
		
		if(s2.equals(s3)) {
			System.out.println("s2.equals(s3)");
		}
		
	}

}

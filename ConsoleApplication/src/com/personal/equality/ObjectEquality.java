package com.personal.equality;

import java.util.Date;

public class ObjectEquality {

	public static void main(String[] args) {

		Review r1 = new Review(1, "test", "good", new Date());
		
		Review r2 = new Review(1, "test", "good", new Date());

		System.out.println("R1 memory location : " +  r1);
		System.out.println("R2 memory location : " +  r2);

		//Compare memory location only
		if(r1 == r2) {
			System.out.println("r1 == r2");
		}
		
		//Default object's equal method act the same as ==
		if(r1.equals(r2)) {
			System.out.println("r1.equals(r2)");
		}
		
		
		System.out.println("After assign reference.");

		r1 = r2;
		
		//Compare memory location only
		if(r1 == r2) {
			System.out.println("r1 == r2");
		}
		
		//Default object's equal method act the same as ==
		if(r1.equals(r2)) {
			System.out.println("r1.equals(r2)");
		}
		
	}

}

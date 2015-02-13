package com.personal.equality;


public class ObjectOverrideEqualDriver {

	public static void main(String[] args) {
		
		OverrideEqualReview r1 = new OverrideEqualReview(1, "test", "good");
		
		OverrideEqualReview r2 = new OverrideEqualReview(1, "test", "good");

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

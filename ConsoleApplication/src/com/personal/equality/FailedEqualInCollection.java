package com.personal.equality;

import java.util.HashSet;
import java.util.Set;

public class FailedEqualInCollection {

	public static void main(String[] args) {

		
		Set<Review> nameSet = new HashSet<Review>(); 
		nameSet.add(new Review(1, "test", "test", null));
		nameSet.add(new Review(2, "test1", "test1", null));
		nameSet.add(new Review(1, "test", "test", null));
		
		System.out.print("=========");
		printSet(nameSet);
		
		
		//Override equal
		Set<OverrideEqualReview> nameSet1 = new HashSet<OverrideEqualReview>(); 
		nameSet1.add(new OverrideEqualReview(1, "test", "test"));
		nameSet1.add(new OverrideEqualReview(2, "test1", "test1"));
		nameSet1.add(new OverrideEqualReview(1, "test", "test"));
		
		System.out.print("=========");
		printOverrideEqualSet(nameSet1);
		
	}
	
	
	private static void printSet(Set<Review> c) {
		for(Review s : c) {
			System.out.println(s.getId() + " " + s.getReviewerName() + " " + s.getReviewComment() + " " + s.getReviewDate() );
		}
	}
	
	private static void printOverrideEqualSet(Set<OverrideEqualReview> c) {
		for(OverrideEqualReview s : c) {
			System.out.println(s.getId() + " " + s.getReviewerName() + " " + s.getReviewComment() );
		}
	}

}

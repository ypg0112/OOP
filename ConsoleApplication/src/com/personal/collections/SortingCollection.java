package com.personal.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingCollection {

	public static void main(String[] args) {

		List<String> duplicateList = new ArrayList<String>();
		duplicateList.add("d");
		duplicateList.add("b");
		duplicateList.add("a");
		duplicateList.add("c");
		duplicateList.add("c");
		
		printList(duplicateList);
		final int i = 10;
		
		//Strategy design pattern.
		Collections.sort(duplicateList, new Comparator<String>() {
			
			// return = 0 o1.equals(o2)
			// return > 0 o1 > o2
			// return < 0 o1 < o2
			@Override
			public int compare(String o1, String o2) {
				System.out.println(i);
				return o2.compareTo(o1);
			}
		});
		
		System.out.println("");
		
		printList(duplicateList);
	}
	
	private static void printList(List<String> c) {
		
		for(String s : c) {
			System.out.print(String.format("%s ", s));
		}
	}

}

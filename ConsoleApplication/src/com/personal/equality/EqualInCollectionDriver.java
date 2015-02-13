package com.personal.equality;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class EqualInCollectionDriver {

	public static void main(String[] args) {
		
		//Before java version 1.6
		Set test = new HashSet();
		test.add("test");
		test.add(10);
		test.add(new Review(0, "", "", new Date()));
		
		for(Object o : test) {
			if(o instanceof String) {
				String st = (String) o; //explicit casting. Down-Casting
				System.out.print(st + " ");
			}
			else if(o instanceof Integer) {
				Integer num = (Integer) o + 10;
				System.out.print(num + " ");

			}
		}
		
		//P2I program to interface
		Set<String> nameSet = new HashSet<String>(); //Liskov substitution principle
		List<String> duplicateList = new ArrayList<String>();
		duplicateList.add("a");
		duplicateList.add("b");
		duplicateList.add("c");
		duplicateList.add("c");
				
		for(String str : duplicateList) {
			nameSet.add(str);
		}
		
		printList(duplicateList);
		System.out.print("=========");
		printSet(nameSet);
		
		if(duplicateList.contains("a")) 
			System.out.print("List contains a.");

	}

	private static void printSet(Set<String> c) {
		for(String s : c) {
			System.out.print(s + " ");
		}
	}
	

	private static void printList(List<String> c) {
		
		for(String s : c) {
			System.out.print(String.format("%s ", s));
		}
	}
}

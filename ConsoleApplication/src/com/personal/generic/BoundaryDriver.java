package com.personal.generic;

public class BoundaryDriver {

	public static void main(String[] args) {

		BoundaryKeyValuePair kv1 = new BoundaryKeyValuePair<>("Test3",100);
		BoundaryKeyValuePair<String, Integer> kv2 = new BoundaryKeyValuePair<String, Integer>("Test",99);

		BoundaryKeyValuePair<Character, Double> kv3 = new BoundaryKeyValuePair<>('B',11.0);
		BoundaryKeyValuePair<Character, Double> kv4 = BoundaryKeyValuePair.<Character, Double>newInstance('A', 10.0);
		BoundaryKeyValuePair<Character, Double> kv5 = BoundaryKeyValuePair.newInstance('A', 10.0);
		
		
		//Compile error
		//BoundaryKeyValuePair<Character, Number> kv6 = BoundaryKeyValuePair.newInstance('A', 10.0);

		
		//Compile error.
		//BoundaryKeyValuePair<BigDecimal, Boolean> kv6 = BoundaryKeyValuePair.newInstance(new BigDecimal(100.0), Boolean.FALSE);
		
		printKeyValuePair(kv1);
		printKeyValuePair(kv2);
		printKeyValuePair(kv3);
		printKeyValuePair(kv4);
		printKeyValuePair(kv5);
		
		printKeyValuePairQuestionMark(kv1);
	}
	
	private static <K,V extends Number> void printKeyValuePair(BoundaryKeyValuePair<K, V> kv) {
		System.out.println("" + kv.getKey());
	}
	
	private static void printKeyValuePairQuestionMark(BoundaryKeyValuePair<?, ?> kv) {
		System.out.println("" + kv.getKey());
	}
	

}

package com.personal.generic;

import java.math.BigDecimal;

public class KeyValuePairDriver {

	public static void main(String[] arg) {
		
		//Initialize object
		KeyValuePair<String, Integer> kv1 = new KeyValuePair<>("Test3",100);
		KeyValuePair<String, Integer> kv2 = new KeyValuePair<String, Integer>("Test",99);

		KeyValuePair<Character, Double> kv3 = new KeyValuePair<>('B',11.0);
		KeyValuePair<Character, Double> kv4 = KeyValuePair.<Character, Double>newInstance('A', 10.0);
		KeyValuePair<Character, Double> kv5 = KeyValuePair.newInstance('A', 10.0);
		
		KeyValuePair<BigDecimal, Boolean> kv6 = KeyValuePair.newInstance(new BigDecimal(100.0), Boolean.FALSE);

		
		printKeyValuePair(kv1);
		printKeyValuePair(kv2);
		printKeyValuePair(kv3);
		printKeyValuePair(kv4);
		printKeyValuePair(kv5);
		printKeyValuePair(kv6);

		printKeyValuePairQuestionMark(kv6);
		printKeyValuePairQuestionMark(kv3);


	}

	private static <K,V> void printKeyValuePair(KeyValuePair<K, V> kv) {
		System.out.println("" + kv.getKey() + kv.getValue());
	}
	
	private static void printKeyValuePairQuestionMark(KeyValuePair<?, ?> kv) {
		System.out.println("" + kv.getKey() + kv.getValue());
	}
}

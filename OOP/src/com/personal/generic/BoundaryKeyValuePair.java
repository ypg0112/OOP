package com.personal.generic;


public class BoundaryKeyValuePair<K,V extends Number> {
	private K key;
	private V value;
	
	public BoundaryKeyValuePair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public static <K,V extends Number> BoundaryKeyValuePair<K, V> newInstance(K key, V value) {
		return new BoundaryKeyValuePair<K,V>(key, value);
	}
	
	public K getKey() {
		return key;
	}
	public void printDoubleValue() {
		System.out.println(value.doubleValue());
	}
	
	
}

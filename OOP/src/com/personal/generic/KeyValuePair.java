package com.personal.generic;

public class KeyValuePair<K,V> {
	private K key;
	private V value;
	
	
	private KeyValuePair() {
		
	}
	
	public KeyValuePair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public static <K,V> KeyValuePair<K, V> newInstance(K key, V value) {
		return new KeyValuePair<K,V>(key, value);
	}
	
	public void nothing(){
		
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

}

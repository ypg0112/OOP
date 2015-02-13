package com.personal.generic;


public class EnumKeyValuePair<K extends Enum<K> & Sortable<K> , V> {

	private K key;
	private V value;
	
	public EnumKeyValuePair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public static <K extends Enum<K> & Sortable<K> , V> EnumKeyValuePair<K, V> newInstance(K key, V value) {
		return new EnumKeyValuePair<K,V>(key, value);
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

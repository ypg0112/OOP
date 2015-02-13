package com.personal.enumeration;

import java.io.Serializable;

public enum Fruit implements Serializable {

	APPLE("Apple",10),
	GUAVA("Guava",8);
	
	private Fruit(String name, int size) {
		this.name = name;
		this.size = size;
	}
	private String name;
	private int size;
	
	public String getName() {
		return name;
	}
	public int getSize() {
		return size;
	}
	
	
}

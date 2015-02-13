package com.personal.object.creation;

public class FactoryMethodObject {

	private static FactoryMethodObject INSTANCE = new FactoryMethodObject();
	
	private int id;
	
	private String name;
	
	private FactoryMethodObject() {
		
	}
	
	private FactoryMethodObject(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	//factory method.
	public static FactoryMethodObject newInstance(int id, String name) {
		return INSTANCE;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}

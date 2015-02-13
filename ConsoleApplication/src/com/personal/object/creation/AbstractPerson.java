package com.personal.object.creation;

public abstract class AbstractPerson {

	private int id;
	private String name;
	
	protected AbstractPerson(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	public static AbstractPerson getInstance(String type, int id, String name) {
		if(type.equals("Teacher")) {
			return new Teacher(id, name);
		}
		else {
			return new Student(id, name);
		}
	}
}

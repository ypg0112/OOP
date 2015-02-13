package com.personal.object.creation;

public class Teacher extends AbstractPerson {

	private int salary;
	
	public Teacher(int id, String name) {
		super(id, name);
	}

	public Teacher(int id, String name, int salary) {
		super(id, name);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	
	
}

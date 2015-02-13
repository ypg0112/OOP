package com.personal.object.creation;

public class Student extends AbstractPerson {

	private int score;
	
	public Student(int id, String name) {
		super(id, name);
	}

	public Student(int id, String name, int score) {
		super(id, name);
		this.score = score;
	}

	public int getScore() {
		return score;
	}

}

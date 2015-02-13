package com.personal.enumeration;

/**
 * Super class of all enum is {@link Enum}. 
 *
 */
public enum DayOfWeek {
	MONDAY,
	TUESDAY,
	WENDESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY;
	
	@Override
	public String toString() {
		return "Today is " + this.name();
	}
	
	public int getNumber() {
		return this.ordinal();
	}
}

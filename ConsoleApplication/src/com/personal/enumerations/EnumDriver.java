package com.personal.enumerations;

import com.personal.enumeration.DayOfWeek;
import com.personal.enumeration.DayOfWeekInterface;

public class EnumDriver {

	public static void main(String[] args) {

		printConstants(DayOfWeekInterface.MONDAY);
		printEnum(DayOfWeek.MONDAY);
		System.out.println(DayOfWeek.MONDAY.getNumber());

		//printEnum("cannot pass string into the method.");
		printConstants("asdfawer");
	}
	
	private static void printConstants(String interfaceValue) {
		switch (interfaceValue) {
		case "MONDAY":
			System.out.println(interfaceValue);
			break;
			//....
		default:
			break;
		}
	}
	
	//Type safe.
	private static void printEnum(DayOfWeek dow) {
		switch (dow) {
		case MONDAY:
			System.out.println(dow.getNumber());

			break;
		case TUESDAY:
			System.out.println(dow);

			break;
		case WENDESDAY:
			System.out.println(dow);

			break;
		case THURSDAY:
			System.out.println(dow);

			break;
		case FRIDAY:
			System.out.println(dow);

			break;
		case SATURDAY:
			System.out.println(dow);

			break;
		case SUNDAY:
			System.out.println(dow);
			break;	
		default:
			break;
		}
	}

}

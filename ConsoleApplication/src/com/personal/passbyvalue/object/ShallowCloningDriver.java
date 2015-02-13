package com.personal.passbyvalue.object;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import com.personal.clone.Employee;

public class ShallowCloningDriver {

	public static void main(String[] args) {

		System.out.println("Before");
		Employee e1 = new Employee(1, "test", new Date(), createDate(10, 11, 2020));
		print(e1);
		
		Date startDate = e1.getStartDate();
		startDate.setTime(createDate(1, 0, 2015).getTime());
		
		System.out.println("After");
		print(e1);
		
	}
	
	private static void print(Employee e) {
		SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy");
		System.out.println("Employee: Id = " + e.getId() + "Name =  " + 
				e.getName() + " StartDate = " + format.format(e.getStartDate()) + " EndDate = " + format.format(e.getEndDate()));

	}
	
	private static Date createDate(int day, int month, int year) {
		Calendar c1 = GregorianCalendar.getInstance();
		c1.set(Calendar.DATE, day);
		c1.set(Calendar.MONTH, month); //start from 0
		c1.set(Calendar.YEAR, year);
		return c1.getTime();
	}

}

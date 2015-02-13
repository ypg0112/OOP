package com.personal.object.creation;

import java.util.Calendar;

public class ObjectDriver {

	public static void main(String[] args) {

		FactoryMethodObject obj = FactoryMethodObject.newInstance(1, "test");
		
		//build-in in java
		Calendar c = Calendar.getInstance();
		
		AbstractPerson person = AbstractPerson.getInstance("Teacher", 1, "test");
		
		
		Product p = ProductFactory.getProduct(1, "test");
	}

}

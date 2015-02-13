package com.personal.inherited.method.template.pattern;

import com.personal.enumeration.Operation;

public class CalculationFactory {

	private CalculationFactory() {
		
	}
	
	public static Calculatable getCalculator(Operation operation) {
		switch (operation) {
		case MINUS: 
			return new ConcreteSubstractMessageCalculator();
		case DIVIDE: 
			return new ConcreteDivideMessageCalculator();
		case PLUS: 
			return new ConcretePlusMessageCalculator();
		case TIMES: 
			return new ConcreteTimesMessageCalculator();
		default:
			return new ConcretePlusMessageCalculator();
		}
	}
}

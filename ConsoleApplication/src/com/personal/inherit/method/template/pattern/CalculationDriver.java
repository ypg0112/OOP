package com.personal.inherit.method.template.pattern;


import com.personal.enumeration.Operation;
import com.personal.inherited.method.template.pattern.Calculatable;
import com.personal.inherited.method.template.pattern.CalculationFactory;

public class CalculationDriver {

	public static void main(String[] args) {
		
		Calculatable calculator = CalculationFactory.getCalculator(Operation.TIMES);
		System.out.println(calculator.calculate(100.0,100.0));
		
		calculator = CalculationFactory.getCalculator(Operation.DIVIDE);
		System.out.println(calculator.calculate(100.0,100.0));
		
		calculator = CalculationFactory.getCalculator(Operation.MINUS);
		System.out.println(calculator.calculate(100.0,100.0));
		
		calculator = CalculationFactory.getCalculator(Operation.PLUS);
		System.out.println(calculator.calculate(100.0,100.0));
	}

}

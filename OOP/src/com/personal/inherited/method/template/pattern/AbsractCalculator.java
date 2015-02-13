package com.personal.inherited.method.template.pattern;

import com.personal.enumeration.Operation;

public abstract class AbsractCalculator implements Calculatable {

	public abstract String getBeforeCalculateMessage();
	
	public abstract String getAfterCalculateMessage();
	
	public abstract Operation getOperation();

	//Skeleton code
	@Override
	public double calculate(double value1,double value2) {
		System.out.println(this.getBeforeCalculateMessage());
		double result = getOperation().apply(value1, value2);

		System.out.println(this.getAfterCalculateMessage());
		return result;
	}

}

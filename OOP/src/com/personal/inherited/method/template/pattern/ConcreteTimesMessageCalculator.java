package com.personal.inherited.method.template.pattern;

import com.personal.enumeration.Operation;

class ConcreteTimesMessageCalculator extends AbsractCalculator {

	@Override
	public String getBeforeCalculateMessage() {
		return "Starting calculation in ConcreteTimesMessageCalculator";
	}

	@Override
	public String getAfterCalculateMessage() {
		return "Ending calculation in ConcreteTimesMessageCalculator";
	}

	@Override
	public Operation getOperation() {
		return Operation.TIMES;
	}
}

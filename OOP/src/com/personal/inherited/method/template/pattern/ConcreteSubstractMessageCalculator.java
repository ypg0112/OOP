package com.personal.inherited.method.template.pattern;

import com.personal.enumeration.Operation;

class ConcreteSubstractMessageCalculator extends AbsractCalculator {

	@Override
	public String getBeforeCalculateMessage() {
		return "Starting calculation in ConcreteSubstractMessageCalculator";
	}

	@Override
	public String getAfterCalculateMessage() {
		return "Ending calculation in ConcreteSubstractMessageCalculator";
	}

	@Override
	public Operation getOperation() {
		return Operation.MINUS;
	}
}

package com.personal.inherited.method.template.pattern;

import com.personal.enumeration.Operation;

class ConcretePlusMessageCalculator extends AbsractCalculator {

	@Override
	public String getBeforeCalculateMessage() {
		return "Starting calculation in ConcretePlusMessageCalculator";
	}

	@Override
	public String getAfterCalculateMessage() {
		return "Ending calculation in ConcretePlusMessageCalculator";
	}

	@Override
	public Operation getOperation() {
		return Operation.PLUS;
	}
}

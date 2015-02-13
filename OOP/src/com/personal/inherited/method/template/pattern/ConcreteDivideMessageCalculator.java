package com.personal.inherited.method.template.pattern;

import com.personal.enumeration.Operation;

class ConcreteDivideMessageCalculator extends AbsractCalculator {

	@Override
	public String getBeforeCalculateMessage() {
		return "Starting calculation in ConcreteDivideMessageCalculator";
	}

	@Override
	public String getAfterCalculateMessage() {
		return "Ending calculation in ConcreteDivideMessageCalculator";
	}

	@Override
	public Operation getOperation() {
		return Operation.DIVIDE;
	}

}

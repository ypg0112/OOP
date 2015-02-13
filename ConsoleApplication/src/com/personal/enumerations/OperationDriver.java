package com.personal.enumerations;

import com.personal.enumeration.Operation;

public class OperationDriver {

	public static void main(String[] args) {

		for(Operation op : Operation.values()) {
			double result = compute(op,2,4);
			System.out.println(result);
		}
	}

	private static double compute(Operation operation, double x, double y) {
		return operation.apply(x,y);
	}
}

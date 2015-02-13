package com.personal.enumeration;

public enum Operation implements Comparable<Operation> {

	PLUS("+") {
		@Override
		public double apply(double x, double y) {
			return x + y;
		}
	},
	MINUS("-") {
		@Override
		public double apply(double x, double y) {
			return x - y;
		}
	},
	TIMES("*") {
		@Override
		public  double apply(double x, double y) {
			return x * y;
		}
	},
	DIVIDE("/") {
		@Override
		public double apply(double x, double y) {
			return x / y;
		}
	};
	
	private Operation(String symbol) {
		this.symbol = symbol;
	}
	
	private String symbol;
	
	public abstract double apply(double x, double y);
}

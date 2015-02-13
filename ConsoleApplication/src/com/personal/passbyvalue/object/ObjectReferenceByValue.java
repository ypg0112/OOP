package com.personal.passbyvalue.object;

public class ObjectReferenceByValue {

	public static void main(String[] args) {

		Point p1 = new Point(1,1);
		Point p2 = new Point(2,2);
		
		System.out.println("Before Swap:");
		p1.print();
		p2.print();
		swap(p1,p2);
		
		System.out.println("After Swap:");
		p1.print();
		p2.print();
		
		
	}
	
	private static void swap(Point p1, Point p2) {
		Point t = p1;
		p1 = p2;
		p2 = t;
	}


	private static class Point {
		private int x;
		private int y;
		
		public Point(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
		
		public void print() {
			System.out.println("x=" + x + ", y=" + y);
		}
	}
}

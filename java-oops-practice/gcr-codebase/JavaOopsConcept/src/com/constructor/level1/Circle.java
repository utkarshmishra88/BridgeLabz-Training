package com.constructor.level1;

public class Circle {
	// Attribute
		private double radius;

		// default constructor
		public Circle() {
			this(5.0);
		}

		// parameterized constructor
		public Circle(double radius) {
			this.radius = radius;
		}

		// display result
		void display() {
			System.out.println("Radius: " + this.radius);
			System.out.println();
		}
}
